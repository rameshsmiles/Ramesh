package com.Pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExtractTextBox {


	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/advanced_search");

		//Enter Data on theFirst Text box
		List<WebElement> ele=driver.findElements(By.xpath("//input[@type='text']"));
		for(int i=0;i<ele.size();i++) {
			ele.get(i).sendKeys("selenium");
		}

	}
}