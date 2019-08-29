package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
	 WebDriver driver;
	    @Test
	    public void testApp() {
	    	System.setProperty("webdriver.chrome.driver", ".\\selenium_drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
		    WebElement radiobutton1;
		    radiobutton1=driver.findElement(By.xpath("//input[@id='u_0_8']"));
		    radiobutton1.click();
		    System.out.println("selecting female radio button");
		    WebElement radiobutton2;
		    radiobutton2=driver.findElement(By.xpath("//input[@id='u_0_9']"));
		    radiobutton2.click();
		    System.out.println("selecting male radio button");
		    WebElement radiobutton3;
		    radiobutton3=driver.findElement(By.xpath("//input[@id='u_0_a']"));
		    radiobutton3.click();
		    System.out.println("selecting custom radio button");
		    driver.quit();
}
}
