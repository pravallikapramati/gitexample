package com.examples;

import org.testng.annotations.Test;

public class Group {
	@Test(groups = { "sanity", "smoke", "functional" })
	public void login() {
		System.out.println("this is test1");
	}
	@Test(groups = { "sanity" })
	public void compose() {
		System.out.println("this is test2");
	}
	@Test(groups = { "smoke" })
	public void sentitems() {
		System.out.println("this is test3");
	}
}
