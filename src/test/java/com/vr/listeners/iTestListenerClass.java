package com.vr.listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.Basetest;

public class iTestListenerClass extends Basetest implements ITestListener  {

	
	

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		try {
			takeScreenshot(result.getTestName());
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		
	}

	



	
	
	

}
