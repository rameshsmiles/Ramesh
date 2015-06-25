package com.Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandBuy {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.clickandbuy.com/WW_en/home.html");
		driver.manage().window().maximize();
		//Mouseover on the login option
		Actions builder=new Actions(driver);
		WebElement span = driver.findElement(By.xpath("//*[@id='menu_96']/a/span"));
		builder.moveToElement(span).build().perform();
		Thread.sleep(5000);
		//Select the frame
		driver.switchTo().frame("iframelayer");
		//Enter data on the Username and Password fields
		driver.findElement(By.id("username")).sendKeys("selenum");
		driver.findElement(By.id("passwort")).sendKeys("selenium");
		//Get back to the foucs
		driver.switchTo().defaultContent();
	}

}
