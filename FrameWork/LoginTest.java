package com.Gmail.TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.read.biff.BiffException;

import com.Gmail.utility.WebElements;

public class LoginTest {

	WebElements element=null;
	
	public LoginTest() {
		element=new WebElements();
	}
	
	public void launch(){
		element.getURL();
	}
	public String invalid() throws FileNotFoundException, BiffException, IOException, InterruptedException {
		element.textBox(element.getElementProperty("UserName"),element.excelRead(3, 1, 0));
		element.textBox(element.getElementProperty("Password"),element.excelRead(3, 2, 0));
		element.button(element.getElementProperty("SignIn"));
		Thread.sleep(5000);
		String val=element.getText(element.getElementProperty("InvalidData"));
		return val;
	}
	public static void main(String[] args) throws FileNotFoundException, BiffException, IOException, InterruptedException {
		LoginTest t=new LoginTest();
		t.launch();
		t.invalid();

	}

}
