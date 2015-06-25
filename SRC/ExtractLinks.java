package com.Pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExtractLinks {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.rightstart.com/");
		
		List<WebElement> li=driver.findElements(By.tagName("a"));
		
		System.out.println("Link Size ---> "+li.size());
		
		for(int i=0;i<li.size();i++) {
			
			//System.out.println(li.get(i).getAttribute("href"));
			System.out.println(li.get(i).getText());
		}
	}

}
