package com.qa;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions {
	
	SoftAssert sa;
	
//	@Test
//	
//	void test_hardassertions() {
//		
//		System.out.println("abc");
//		
//		System.out.println("def");
//		
//		Assert.assertEquals(1, 2);//hard assertion
//		
//		System.out.println("123");
//		
//		System.out.println("abc");
//		
//	}
	
	@Test
	
	void test_softassertion() {
		
		 sa=new SoftAssert();
		
        System.out.println("abc");
		
		System.out.println("def");
		
		sa.assertEquals(1, 2);//soft assertion
		
        System.out.println("123");
		
		System.out.println("abc");
		
		sa.assertAll();//mandatory method
		
		
	}

}
