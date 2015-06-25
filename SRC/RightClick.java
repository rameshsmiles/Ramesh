package com.Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.co.in");
		
		driver.manage().window().maximize();
		
		WebElement elementq = driver.findElement(By.name("q"));
		 Actions builderq = new Actions(driver);
		 Action rClick = builderq.contextClick(elementq).build();
		 rClick.perform(); 
	}

}
