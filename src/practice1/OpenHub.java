package practice1;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenHub {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		String chrome_driver_path = ".\\selenium_drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chrome_driver_path);
		driver = new ChromeDriver();

	}

	@Test
	public void verifyPagemainPAgeTitle() throws InterruptedException {
		driver.get("https://www.openhub.net");
		Thread.sleep(5000);
		// verify the page title
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Open Hub, the open source network";
		// use assert to verify the page title
		assertEquals(expectedTitle, actualTitle);
		System.out.println("page title is verified");

		// verify navigation header tab
		ArrayList<String> expected_headers = new ArrayList<String>(
				Arrays.asList("Projects", "People", "Organization", "Tools", "Blog"));

		List<String> actual_headers = new ArrayList<>();
		/*
		 * myList.add("ddd"); System.out.println(myList);
		 * System.out.println(myList.toString());
		 */

		//
		List<WebElement> navigationlist = driver.findElements(By.xpath("//ul[@class='new_main_menu']/li"));
		System.out.println(navigationlist.size());
		for (WebElement element : navigationlist) {
			System.out.println(element.getText());
			actual_headers.add(element.getText());

		}
		System.out.println("ddd : " + actual_headers);

		AssertEquals(actual_headers, expected_headers);
		WebElement ao;
		ao = driver.findElement(By.xpath("//a[contains(text(),'Blog')]"));
		ao.click();
		Set<String> st = driver.getWindowHandles();
		Iterator<String> it = st.iterator();
		String parent = it.next();
		String child = it.next();
		// switch to child
		driver.switchTo().window(child);
		Thread.sleep(5000);
		WebElement bo;
		bo = driver.findElement(By.xpath("//div[@class='pagination woo-pagination']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", bo);
		Thread.sleep(5000);
		List<WebElement> pageList = driver.findElements(By.xpath("//div[@class='pagination woo-pagination']/a"));
		System.out.println("list size  ::  " + pageList.size());
//		System.out.println(pageList.get(0).getText());
		for (WebElement element1 : pageList) {
			System.out.println(element1.getText());
			System.out.println(element1.getAttribute("href"));
		}
			driver.close();

			// swtich to parent
			driver.switchTo().window(parent);
			System.out.println("Returned to parent");
			driver.close();
		}

	

	private boolean AssertEquals(List<String> actual_headers, ArrayList<String> expected_headers) {
		// TODO Auto-generated method stub
		return false;
	}

}
