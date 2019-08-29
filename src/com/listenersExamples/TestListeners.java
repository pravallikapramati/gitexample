package com.listenersExamples;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestListeners implements ITestListener {
	// print browser name by using parameter.
//	@Parameters({ "browser" })
	@Test(enabled = false)
	public void test1() {

		System.out.println("printing test1 from listeners");

	}
	//print browser name and url by using parameter  (using multiple parameters in a single method.)
//	@Parameters({ "browsername", "url" })
	@Test
	public void test2() {

		System.out.println("printing test2 from listeners");

	}
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
