package com.Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/ci/engine/match/762493.html");
		driver.manage().window().maximize();
	
		//*[@id='inningsBat1']/tbody/tr[3]/td[2]
		//*[@id='inningsBat1']/tbody/tr[5]/td[2]
		//*[@id='inningsBat1']/tbody/tr[7]/td[2]
		//*[@id='inningsBat1']/tbody/tr[9]/td[2]
		
		//*[@id='inningsBat1']/tbody/tr[21]/td[2]
		
		String xpath_First="//*[@id='inningsBat1']/tbody/tr[";
		String xpath_End="]/td[2]";
		
		int i=3;
		for(i=3;i<=21;i=i+2) {
		
			String batsMen=driver.findElement(By.xpath(xpath_First+i+xpath_End)).getText();
			System.out.println(batsMen);
		}
	}

}
