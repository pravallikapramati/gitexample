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

public class Sample3 {
	
	@BeforeMethod(description = "this is before moethod.")
	public void setup() {
		System.out.println("this is before method");
	}
	@AfterMethod(description = "this is after method")
	public void tearDown() {
		System.out.println("this is after method");
		
	}
	@BeforeClass(description = "this is before class")
	public void beforeClass() {
		System.out.println("this is before class");
	}
	@AfterClass(description = "this is after class")
	public void afterClass() {
		System.out.println("this is after class");
		
	}
	
	@BeforeTest(description = "this is before test")
	public void beforeTest() {
		System.out.println("this is before test");
	}
	@AfterTest(description = "this is after test")
	public void afterTest() {
		System.out.println("this is after test");
		
	}
	//
	@BeforeSuite(description = "this is before suite")
	public void beforeSuite() {
		System.out.println("this is before suite");
	}
	@AfterSuite(description = "this is after suite")
	public void afterSuite() {
		System.out.println("this is after suite");
		
	}
	//
	
	@Test(description = "this is test1 description",priority=1)
	public void login() {
		System.out.println("this is test1");
	}
	@Test(description = "this is test2 description",priority=2)
	public void compose() {
		System.out.println("this is test2");
	}
	@Test(description = "this is test3",priority=3)
	public void sentitems() {
		System.out.println("this is test3");
	}
	@Test(description = " this is test4",priority=4)
	public void test5() {
		System.out.println("this is test4");
	}
	@Test(description = "this is test5",priority=5)
	public void test4() {
		System.out.println("this is test5");
	}
	@Test(description = "this is test6",priority=6)
	public void test6() {
		System.out.println("this is test6");
	}
	

}
