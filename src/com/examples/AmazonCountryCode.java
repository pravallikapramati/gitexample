package com.examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AmazonCountryCode {
	WebDriver driver;

	@Test
	public void test1() throws InterruptedException {
		// open firefox browser
		System.setProperty("webdriver.chrome.driver", ".\\selenium_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dgooginabkvernac-21%26ascsubtag%3D_k_CjwKCAjwkenqBRBgEiwA-bZVtsyDsYZysLnlm8I05DMI0VXVDQxoFfc5CRBYYElOjuhuLs6Fz45B6hoCS_sQAvD_BwE_k_%26ext_vrnc%3Dhi%26gclid%3DCjwKCAjwkenqBRBgEiwA-bZVtsyDsYZysLnlm8I05DMI0VXVDQxoFfc5CRBYYElOjuhuLs6Fz45B6hoCS_sQAvD_BwE%26ref_%3Dnav_ya_signin&prevRID=0KTNDM42HG1H45T01D27&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&ubid=257-6681436-9406921");
		Thread.sleep(5000);
	}

	@Test
	public void test2() {
		WebElement bo;
		bo = driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
		bo.click();
	}

	@Test
	public void test3() {
		List<WebElement> codeList = driver.findElements(By.xpath("//ul[@class='a-nostyle a-list-link']/li"));
		System.out.println(codeList.size());
		for (WebElement element : codeList) {
			System.out.println(element.getText());
			
		}
		}
}
		/*
		 * String str = "Marshall Islands +692"; System.out.println(str.substring(16));
		 */
		

