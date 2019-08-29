package com.examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OPenHub {
	WebDriver driver;

	@Test
	public void test1() {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pravalikam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.openhub.net");
		
	}
	@Test
	public void verifyPagemainPAgeTitle() {
		
		//verify the page title
		String actualTitle = driver.getTitle();
		String expectedTitle = "Title of Page";
		//use assert to verify the page title
		
	
		
		
		
	
	System.out.println("page title is verified");
		}
	@Test
	public void test3() {
		
		
	}

}
