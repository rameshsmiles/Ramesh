package com.Pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleTextBoxes {
	
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.com/advanced_search");
		
		driver.manage().window().maximize();
		
		//Create an Array
		String[] val=new String[5];
		val[0]="First Name";
		val[1]="Last Name";
		val[2]="Middle Name";
		val[3]="Email Address";
		val[4]="Postal Code";
		
		//Extract all the textboxes
		List<WebElement> ele=driver.findElements(By.xpath("//input[@type='text']"));
		
		for(int i=0;i<ele.size();i++) {
			ele.get(i).sendKeys(val[i]);
		}
	}

}
