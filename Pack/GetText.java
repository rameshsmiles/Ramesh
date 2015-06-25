package com.Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetText {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		//Click on signIn option
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(5000);
		//Get the warning message text
	String textData=driver.findElement(By.id("errormsg_0_Email")).getText();
	System.out.println("Text Data is ---> "+textData);
	}

}
