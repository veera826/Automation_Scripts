package com.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	
	void test() {
		
		//Hard Assertion/Static Methods
		
		
		Assert.assertEquals(123, 123);
		
		Assert.assertNotEquals(123, 12);
		
		Assert.assertTrue(true);
		
		Assert.assertTrue(1==2);
		
		Assert.assertFalse(true);
		
		Assert.assertFalse(1==2);
		
		Assert.fail();
		
		
	}

}
