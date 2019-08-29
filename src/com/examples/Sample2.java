package com.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2 {
	
	@BeforeMethod(description = "this is before moethod.")
	public void setup() {
		System.out.println("this is before method");
	}
	@AfterMethod(description = "dddddd")
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
