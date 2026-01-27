package com.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencymethod_testng {
	
	
	@Test(priority=1)
	void openapp() {
		
		
		Assert.assertTrue(false);
	}
	
	@Test(priority=2,dependsOnMethods = {"openapp"})
	void login() {
		
		
		Assert.assertTrue(true);
	}
	
	
	@Test(priority=3)
	void search() {
		
		Assert.assertTrue(true);
		
	}
	
	@Test(priority=4)
	void advsearch() {
		
		Assert.assertTrue(true);
		
	}
	
	

}
