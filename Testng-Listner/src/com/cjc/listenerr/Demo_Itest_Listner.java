package com.cjc.listenerr;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Demo_Itest_Listner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
      
		System.out.println("*************GET CALL BEFORE METHOD**********");		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("*************ON TEST METHOD RESUTL IS PASS************");		

	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("*************ON TEST METHOD RESUTL IS FAILED************");		

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("*************ON TEST METHOD RESUTL IS SKIPPED************");		

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("*************ON TEST METHOD RESUTL IS PERCENTAGE************");		

	}

	@Override
	public void onStart(ITestContext context) {

		System.out.println("*************ON TEST METHOD RESUTL IS BEFORE SUITE************");		

	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println("*************ON TEST METHOD RESUTL IS AFTER SUITE************");		

	}

	
	
	
	
}

