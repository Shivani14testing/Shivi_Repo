package com.com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;

public class ngTest {

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Main Test Starting ");
  }
	  
  @Test
  public void f() {
	  System.out.println("purana test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("testing started");
  }
  
  @Test
  public void a1() {
	  System.out.println("naya test");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("testing completed");
  }

}
