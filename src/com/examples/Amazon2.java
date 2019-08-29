package com.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class Amazon2 {
	WebDriver driver;
	@BeforeClass
	public void signin() {
		//sign in to amazon account
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pravalikam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=googinabkvernac-21&ascsubtag=_k_CjwKCAjwtO7qBRBQEiwAl5WC20bKlgE-VH4PplVVTwArK16fbMmGnsE5SMPPRQainj5yaI-Qlsz4shoC7FoQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAjwtO7qBRBQEiwAl5WC20bKlgE-VH4PplVVTwArK16fbMmGnsE5SMPPRQainj5yaI-Qlsz4shoC7FoQAvD_BwE");
		WebElement bo; 
		//driver.findElement(By.id("nav-your-amazon")).click();
		/*
		 * String username="9951293579";
		 * driver.findElement(By.id("ap_email")).sendKeys(username);
		 * driver.findElement(By.id("ap_password")).sendKeys("ammu1234");
		 * driver.findElement(By.id("signInSubmit")).click();
		 */		}

	/*
	 * @Test public void Browsinghistory(){ //checking browsing history
	 * driver.findElement(By.id("nav-recently-viewed")).click();
	 */
	@Test
	
	public void searchingProduct() throws InterruptedException{
		//searching for a product
		//ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tv 32 inches");
		driver.findElement(By.className("nav-input")).click();	
		driver.findElement(By.xpath("//div[@class='rush-component']//div[@class='rush-component']//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Shinco 80 cm (32 Inches) HD Ready LED TV SO3A (Bla')]")).click();
		// Switch newly open Tab
		//System.out.println(tabs.size());
				//driver.switchTo().window(tabs.get(1));
				// Perform some operation on Newly open tab
				//driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
				//driver.findElement(By.xpath("//a[@id='hlb-view-cart-announce']")).click();
				// Close newly open tab after performing some operations.
				//driver.close();

				// Switch to old(Parent) tab.
				//driver.switchTo().window(tabs.get(0));
		Set <String> st= driver.getWindowHandles();
		Iterator<String> it = st.iterator();
		String parent =  it.next();
		String child = it.next();

		// switch to child
		driver.switchTo().window(child);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//a[@id='hlb-view-cart-announce']")).click();

		//swtich to parent
		driver.switchTo().window(parent);
		System.out.println("Returned to parent");
	}
	/*
	 * @Test public void giftCards(){ driver.findElement(By.className("nav-a")); }
	 */
	/*
	 * @Test public void departments(){ //department
	 * driver.findElement(By.className("nav-icon nav-arrow"));
	 * 
	 * }
	 */
	}
	
	 
	
	


