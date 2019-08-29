package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkeDin {
	WebDriver driver;

	@BeforeTest
	public void linkedinpage() {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pravalikam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
	}

	@BeforeClass
	public void signin() {
		// sigin in to linkedin
		WebElement username;
		username = driver.findElement(By.xpath("//a[@class='nav__button-secondary']"));
		username.click();
		username = driver.findElement(By.id("username"));
		username.sendKeys("pravalikareddy1439@gmail.com");
		username = driver.findElement(By.id("password"));
		username.sendKeys("Pravalika@123");
		username = driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']"));
		username.click();
	}

	@Test(priority = 1)
	public void HomePage() throws InterruptedException {
		// displaying home page
		WebElement homepage;

		homepage = driver.findElement(By.id("feed-tab-icon"));
		homepage.click();
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void MyNetwork() throws InterruptedException {
		// searching for connections
		WebElement network;
		network = driver.findElement(By.id("mynetwork-tab-icon"));
		network.click();
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void Jobs() throws InterruptedException {
		// searching for jobs
		WebElement job;
		job = driver.findElement(By.id("jobs-tab-icon"));
		job.click();
		Thread.sleep(5000);
		System.out.println(" Your dream job’s just a search away…");
		// enter job name
		WebElement search;
		search = driver.findElement(By.xpath("//input[@placeholder='Search jobs']"));
		search.clear();
		search.sendKeys("quality assurance associate");
		// enter location
		driver.findElement(By.xpath("//input[@placeholder='Search location']")).sendKeys("hyderabad,india");
		// click search button
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		// get the job result count or print any job name.
		Thread.sleep(6000);
	}

	@Test(priority = 4)
	public void Messages() throws InterruptedException {
		// Messages
		WebElement message;
		message = driver.findElement(By.id("messaging-tab-icon"));
		message.click();
		/*
		 * message=driver.findElement(By.xpath("//input[@id='search-conversations']"));
		 * message.sendKeys("cassie"); message.click();
		 */
		Thread.sleep(5000);
	}

	@Test(priority = 5)
	public void search() throws InterruptedException {
		// searching for a paricular user
		WebElement ao;
		ao = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		ao.sendKeys("deekshitha telukuntla");
		ao = driver.findElement(By.className("search-global-typeahead__controls"));
		ao.click();
		Thread.sleep(5000);
	}

	@Test(priority = 7)
	public void TitleContainer() throws InterruptedException {
		WebElement bo;
		bo = driver.findElement(By.xpath("//li-icon[@class='nav-item__icon']"));
		bo.click();
		Thread.sleep(5000);
	}

	@Test(priority = 6)
	public void Notifications() throws InterruptedException {
		// notifications
		WebElement co;
		co = driver.findElement(By.id("notifications-tab-icon"));
		co.click();
		Thread.sleep(5000);
	}

//	/*
//	 * @Test public void test2() { List<WebElement>
//	 * profileList=driver.findElements(By.
//	 * xpath("//ul[@class='dropdown-options nav-settings__dropdown-options dropdown-options--expanded ember-view']"
//	 * )); System.out.println(profileList.size()); int var=profileList.size(); //
//	 * for(int i=0;i<var;i++) for (WebElement element: profileList) {
//	 * System.out.println(element.getText()); } }
//	 */  
	@AfterClass()
	public void Profile() throws InterruptedException {
		// Profile

		WebElement a1;
		a1 = driver.findElement(By.xpath("//button[@id='nav-settings__dropdown-trigger']"));
		a1.click();
		Thread.sleep(2000);
		WebElement logout;
		// signout
		logout = driver.findElement(By.linkText("Sign out"));
		logout.click();
		Thread.sleep(5000);
		driver.quit();
	}
}
