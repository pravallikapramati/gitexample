package com.examples;

import org.testng.annotations.Test;

public class JavaClass {

	@Test(description="this is test1",groups={"reggression"})
	public void setup() {
		System.out.println("this is setupmethod");
	}
	@Test(dependsOnMethods= {"setup"},description="this is test2",groups= {"smoke"})
	public void login() {
		System.out.println("this is login");
	}
	@Test(dependsOnMethods= {"login"},description="this is test3",groups= {"sanity"})
	public void logout() {
		System.out.println("this is logout");
	}
	@Test(invocationCount=10,description="this is test4",groups= {"functional"})
	public void createuser() {
		System.out.println("this is createuser");
	}
		// TODO Auto-generated method stub

	}


