package com.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TEStng1 {

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

	}


