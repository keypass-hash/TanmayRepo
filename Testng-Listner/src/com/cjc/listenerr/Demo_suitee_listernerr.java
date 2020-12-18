package com.cjc.listenerr;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Demo_suitee_listernerr implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("TTThis METHOD IS ONSTART METHOD");
		
	}

	@Override
	public void onFinish(ISuite suite) {
      System.out.println("THIS METHOD IS ON FINISH METHOD");		
	}

}
