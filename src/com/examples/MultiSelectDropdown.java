package com.examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiSelectDropdown {
	 WebDriver driver;
	    @Test
	    public void testApp() {
	    	System.setProperty("webdriver.chrome.driver", ".\\selenium_drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("file:///C:/Users/pravalikam/Downloads/multipleSelect.html");
	        WebElement dropdown = driver.findElement(By.name("cars"));
			Select brand = new Select(dropdown);
			brand.selectByVisibleText("BMW");
			brand.selectByIndex(1);
			
			//List<WebElement> selected_cars=fruits.getAllSelectedOptions();
			//List<WebElement> selected_cars=fruits.getAllSelectedOptions();
			List<WebElement> selected_cars=brand.getOptions();
			for(WebElement Cars:selected_cars) {
				System.out.println("car="+Cars.getText());
			}
	
	   
}
}