package com.Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupDemo {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.clickandbuy.com/WW_en/home.html");
		String a="selenium";
		driver.findElement(By.id(a)).sendKeys(a);
		/*String b[]=new String[3];
		b[0]="10";
		b[1]="10";
		b[2]="10";
		driver.findElement(By.id(b[2])).sendKeys(a);*/
		driver.manage().window().maximize();
		//mouseover on the register option
		Actions builder=new Actions(driver);
		WebElement span=driver.findElement(By.xpath("//*[@id='menu_95']/a/span"));
		builder.moveToElement(span).build().perform();
		//Thread.sleep(4000);
		//Click on register option
		driver.findElement(By.xpath("//a[@id='link']/span")).click();
		Thread.sleep(7000);
		
		String parentWindow=driver.getWindowHandle();
		
		
		for(String childWindow : driver.getWindowHandles())
			driver.switchTo().window(childWindow);
			
		//Enter data on the Email address field
		driver.findElement(By.id("Email")).sendKeys("selenium");
	
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Contact")).click();
		}
	
	
}
