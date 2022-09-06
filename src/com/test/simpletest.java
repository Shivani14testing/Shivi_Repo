package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class simpletest {
	
	@Test
	public void test1()
	{	System.out.println("test1");	
	
	
	}
	@BeforeMethod
	//@Test
	public void test2()
	{	System.out.println("test2");

}
	
	@Test
	public void test3()
	{System.out.println("test3");
}
   @AfterMethod
	//@Test
	public void test4()
	{System.out.println("test4");
	
	}}