package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum(){
		int a=20;
		int b=10;
		Assert.assertEquals(30, a+b);
	}
	
	
	@Test
	public void sub(){
		int a=20;
		int b=10;
		Assert.assertEquals(10, a-b);
	}

}
