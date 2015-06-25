package com.Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.kesinenitravels.com/");
		//Click on CheckFare
		driver.findElement(By.id("ctl00_ibtnCheckFare")).click();
		Thread.sleep(5000);
		//Click on search option
		driver.findElement(By.id("ctl00_cpEndUserMain_ibtnSearch")).click();
		Thread.sleep(5000);
		//Handeling Alert
		driver.switchTo().alert().accept();
		//Select source as HYderabad
		Thread.sleep(5000);
		new Select(driver.findElement(By.id("ctl00_cpEndUserMain_ddlSource"))).selectByVisibleText("HYDERABAD");
		
	}

}
