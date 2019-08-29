package com.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;


public class MultiSelectDropdown2 {
	WebDriver driver;

	@Test
	public void testApp() throws Exception {
	System.setProperty("webdriver.chrome.driver", ".\\selenium_drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("file:///C:/Users/pravalikam/Downloads/multipleSelect%20(2).html");

	// DropDown Test
	WebElement dropdown = driver.findElement(By.name("cars"));
	Select brand = new Select(dropdown);
	brand.selectByVisibleText("BMW");
	brand.selectByIndex(1);

	//List<WebElement> selected_cars=fruits.getAllSelectedOptions();
	//List<WebElement> selected_cars=fruits.getAllSelectedOptions();
	List<WebElement> selected_cars = brand.getOptions();
	for (WebElement Cars : selected_cars) {
	System.out.println("car=" + Cars.getText());
	}
	

	// Radio Button Test
	WebElement radio1 = driver.findElement(By.cssSelector("input[value = 'male']"));
	WebElement radio2 = driver.findElement(By.cssSelector("input[value = 'female']"));
	WebElement radio3 = driver.findElement(By.cssSelector("input[value = 'other']"));

	radio1.click();
	System.out.println("selecting male");


	Thread.sleep(2000);

	System.out.println("selecting female");
	radio2.click();

	Thread.sleep(2000);

	System.out.println("selecting other");
	radio3.click();

	Thread.sleep(2000);

	// CheckBox T
	WebElement chk1 = driver.findElement(By.name("vehicle1"));
	chk1.click();
	System.out.println("selecting vehicle1");

	Thread.sleep(2000);



	driver.quit();
	}
	}



