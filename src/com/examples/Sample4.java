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

public class Sample4 {
	@Test(priority=1,description="this is login",enabled=false)
	public void login() {
		System.out.println("this is login");
	}

	@Test(priority=2)
	public void compose() {
		System.out.println("this is compose");
	}

	@Test(priority=3)
	public void sentitems() {
		System.out.println("this is sentitems");

	}
	@Test(priority=4)
	public void logout() {
		System.out.println("this is logout");

	}
}
