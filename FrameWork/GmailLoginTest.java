package com.Gmail.TestSuite;


import java.io.FileNotFoundException;

import java.io.IOException;


import junit.framework.Assert;

import jxl.read.biff.BiffException;


import org.apache.xerces.xs.datatypes.ObjectList;

import org.testng.annotations.Test;


import com.Gmail.TestCases.LoginTest;


public class GmailLoginTest 
{

	LoginTest objLoginTest=null;

	
public GmailLoginTest()
	{

		objLoginTest=new LoginTest();
	
	}

  @Test

  public void tc_1() throws FileNotFoundException, BiffException, IOException, InterruptedException
  {

	objLoginTest.launch();
	 
	String val= objLoginTest.invalid();

	System.out.println(val);
	 
	Assert.assertEquals("The email or password you entered is incorrect. ?", val);
  
  }

}
