package com.Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTip {

	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://msdn.microsoft.com/en-in/library/windows/apps/hh465476.aspx");
		
	String toolTip=driver.findElement(By.linkText("Get started")).getAttribute("title");
	System.out.println("ToolTip is "+toolTip);
	}
}
