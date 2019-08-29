package com.examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChildTab {
	WebDriver driver;
	@BeforeClass
	public void signin() {
		//sign in to amazon account
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pravalikam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	}
	@Test
		public void searchingProduct() throws InterruptedException{
			//searching for a product
						 
		/*
		 * driver.findElement(By.id("twotabsearchtextbox")).
		 * sendKeys("fasttrack womenfashion casual analog quartz mineral dial multifuction white leather strap"
		 * ); driver.findElement(By.className("nav-input")).click();
		 * driver.findElement(By.
		 * xpath("//body[@class='a-m-us a-aui_152852-t1 a-aui_157141-c a-aui_158613-t1 a-aui_72554-c a-aui_dropdown_187959-c a-aui_perf_130093-c a-aui_tnr_v2_180836-c a-aui_ux_145937-c a-meter-animate']/div[@id='a-page']/div[@id='search']/div[@class='sg-row']/div[@class='sg-col-20-of-24 sg-col-28-of-32 sg-col-16-of-20 sg-col s-right-column sg-col-32-of-36 sg-col-8-of-12 sg-col-12-of-16 sg-col-24-of-28']/div[@class='sg-col-inner']/span[@class='rush-component s-latency-cf-section']/div[@class='s-result-list s-search-results sg-row']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/h2[1]/a[1]/span[1]"
		 * )).click();
		 * 
		 */			
		 WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		 dropdown.click();
			Select brand = new Select(dropdown);
			brand.selectByValue("search-alias=fashion-womens-intl-ship");
			WebElement ao;
			 ao=driver.findElement(By.className("nav-input"));
			 ao.click();
			driver.findElement(By.xpath("//span[contains(text(),'HANDBAGS & WALLETS')]")).click();
			driver.findElement(By.xpath("//span[contains(text(),\"French Toast Girls' V-Neck Jumper\")]")).click();
		Set <String> st= driver.getWindowHandles();
			Iterator<String> it = st.iterator();
			String parent =  it.next();
			String child = it.next();

			// switch to child
			driver.switchTo().window(child);
			Thread.sleep(2000);
			//add to cart
			driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			//view the cart
			driver.findElement(By.xpath("//a[@id='hlb-view-cart-announce']")).click();

			driver.close();
			Thread.sleep(2000);
			//swtich to parent
			driver.switchTo().window(parent);
			System.out.println("Returned to parent");
			driver.quit();
		}
	}
