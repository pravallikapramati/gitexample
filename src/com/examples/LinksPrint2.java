package com.examples;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinksPrint2 {
		WebDriver driver;

@BeforeTest		
       public void setUp() {
			String chrome_driver_path=".\\selenium_drivers\\chromedriver.exe";
		
			System.setProperty("webdriver.chrome.driver",chrome_driver_path);
			driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/html/html_exercises.asp");
			
		}
		@Test
		public void test2() {
//			driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
			driver.manage().window().maximize();
			
			//Get list of web-elements with tagName  - a
			
			driver.findElement(By.xpath("//div[@id='leftmenuinnerinner']"));
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			System.out.println("All links size : "+ allLinks.size());
			
			for(WebElement link:allLinks){
				if(link.getAttribute("target").equalsIgnoreCase("_top")&&!(link.getText().equalsIgnoreCase("")))
				//if(!(link.getText().equalsIgnoreCase("")||link.getText().equalsIgnoreCase("?")))
				{
					System.out.println(link.getText() + " - " + link.getAttribute("href"));
				}
			}
			
			driver.quit();

}
		
}
