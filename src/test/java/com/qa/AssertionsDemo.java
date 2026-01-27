package com.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	
	@Test
	
	void testTitle() {
		
		String exp_title="veera";
		
		String Act="veera";
		
		//Assert is a class
		//Hard Assertion
		//Soft Assertion
		
		Assert.assertEquals(exp_title, Act);
		
		
		
	}

}
