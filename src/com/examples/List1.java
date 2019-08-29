package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class List1 {
	WebDriver driver;
	@BeforeClass
	public void signin() {
		//sign in to amazon account
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pravalikam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://corridor.pramati.com/apps/");
		WebElement bo; 
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//a[1]")).click();
		}
	
	
	
}