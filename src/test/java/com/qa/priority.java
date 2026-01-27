package com.qa;

import org.testng.annotations.Test;

public class priority {
	
	//Testng executes test methods based on alphabetical order
	//@test(priority=num) controls the order of execution
	//default priority of the test method zero
	//negative numbers also accepted
	
	
	
	@Test(priority=1)
	
	void openapp() {
		
		System.out.println("open application");
	}
	
	@Test(priority=2)
	
	void login() {
		
		System.out.println("Login to Application");
	}
	
	

}
