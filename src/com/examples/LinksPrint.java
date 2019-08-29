package com.examples;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksPrint {
		WebDriver driver;

		@Test
		public void print() {
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\pravalikam\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/xml/xpath_syntax.asp");
			
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
