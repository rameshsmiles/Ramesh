package com.Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.rightstart.com/");
		driver.manage().window().maximize();
		//Mouseover on Kids Room menu


		Actions builder = new Actions(driver);
		WebElement a = driver.findElement(By.id("navigation-top-cat-label-731"));
		builder.moveToElement(a).build().perform();
		
		Thread.sleep(2000);
		//MouseOver on Child Element on Storage and Oraginization

		
		 a = driver.findElement(By.id("navigation-top-cat-label-890"));
		builder.moveToElement(a).build().perform();
		
		Thread.sleep(2000);
		//MouseoVer on the book cases and click on that element same
		 a = driver.findElement(By.id("navigation-top-cat-label-1358"));
			builder.moveToElement(a).click().build().perform();
		Thread.sleep(6000);
		String expectedResult="Bookcases";
		String actualResult=driver.findElement(By.xpath("//div[@class='page']/div[2]/div/div/h1")).getText();
		
		if(expectedResult.equals(actualResult)) {
			System.out.println("Test Case Pass :::");
		}else {
			System.out.println("Fail ::::");
		}
	}

}
