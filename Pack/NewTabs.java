package com.Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTabs {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.co.in");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		driver.get("http://www.gmail.com");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		driver.get("http://www.linkedin.com");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		driver.get("http://www.facebook.com");
	}

}
