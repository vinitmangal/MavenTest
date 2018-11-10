package com.qa.tests;

import org.apache.poi.hpsf.Property;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.utilities.ReadMyExcelConfig;

public class DemoTest1 {

	@Test
	public void sum1(){
		int a=20;
		int b=10;
		Assert.assertEquals(30, a+b);
	}
	
	
	@Test
	public void sub1(){
		int a=30;
		int b=10;
		Assert.assertEquals(20, a-b);
	}
	
	@Test
	public void excelDataValidate(){
		
		System.out.println(System.getProperty("user.dir"));
		ReadMyExcelConfig excel = new ReadMyExcelConfig(System.getProperty("user.dir")+"\\MyTestData.xlsx");
		
		Assert.assertEquals(excel.getData("LoginDetail", 0, 0),"user1");
	}
}
