package com.Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableGetRow {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/ci/engine/match/762493.html");
		driver.manage().window().maximize();
	
		//*[@id='inningsBat1']/tbody/tr[3]/td[2]
		
		String xpath_Start="//*[@id='inningsBat1']/tbody/tr[3]/td[";
		String xpath_end="]";
		
		int i=2;
		
		for(i=2;i<=8;i++) {
			String rowValues=driver.findElement(By.xpath(xpath_Start+i+xpath_end)).getText();
			System.out.println(rowValues);
		}
	}

}
