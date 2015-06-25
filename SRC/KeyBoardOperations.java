package com.Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyBoardOperations {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		String a="selenium";
		driver.findElement(By.id("Email")).sendKeys("selenium");
		
		//Keyboard Operations
		driver.findElement(By.id("Email")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("Email")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("Email")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("Email")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("Email")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("Email")).sendKeys(Keys.CONTROL+"v");
		
		
		
	}

}
