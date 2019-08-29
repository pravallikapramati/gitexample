package com.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample5 {
	
	@BeforeMethod(description = "this is before moethod.")
	public void setup() {
		System.out.println("this is setup");
	}
	@AfterMethod(description = "this is aftermethod")
	public void login() {
		System.out.println("this is login");
		
	}
	@BeforeClass(description = "this is before class")
	public void composeEmail() {
		System.out.println("this is composemail");
	}
	@AfterClass(description = "this is after class")
	public void sentItems() {
		System.out.println("this is sentitems");
		
	}
	
	@BeforeTest(description = "this is before test")
	public void draftEmail() {
		System.out.println("this is draftmail");
	}
	@AfterTest(description = "this is after test")
	public void logout() {
		System.out.println("this is logout");
		
	}
	//
	
	@Test(description = "this is test1 description")
	public void test1() {
		System.out.println("this is test1");
	}
	@Test(description = "this is test2 description")
	public void test2() {
		System.out.println("this is test2");
	}
	@Test(description = "this is test3")
	public void test3() {
		System.out.println("this is test3");
	}
	@Test(description = " this is test4.")
	public void test5() {
		System.out.println("this is test4");
	}
	@Test(description = "this is test5")
	public void test4() {
		System.out.println("this is test5");
	}
	@Test(description = "this is test6")
	public void test6() {
		System.out.println("this is test6");
	}
	

}
