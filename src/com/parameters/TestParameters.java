package com.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {
	// print browser name by using parameter.
	@Parameters({ "browser" })
	@Test(enabled = false)
	public void test1(String newname) {

		System.out.println("test1=" + newname);

	}
	//print browser name and url by using parameter  (using multiple parameters in a single method.)
	@Parameters({ "browsername", "url" })
	@Test
	public void test2(String browsername, String url) {

		System.out.println("brosername : " + browsername +".  url : "+ url);

	}

}
