package com.Gmail.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElements {

	//We have to create reusable funn
	
	WebDriver driver=new FirefoxDriver();
	
	
	public void getURL(){
	driver.get("http://www.gmail.com");
	}
	
	
	public void textBox(String sprop,String sval) {
		//driver.findElement(By.id("Email")).sendKeys("selenium");
		if(sprop.startsWith("//")) {
			driver.findElement(By.xpath(sprop)).sendKeys(sval);
		}
		else {
			driver.findElement(By.id(sprop)).sendKeys(sval);
		}
	}
	public void button(String sprop) {
		if(sprop.startsWith("//")) {
			driver.findElement(By.xpath(sprop)).click();
		}else {
			driver.findElement(By.id(sprop)).click();
		}
	}
	public String getElementProperty(String sprop) throws FileNotFoundException, IOException {
		Properties prop=new Properties();
		prop.load(new FileInputStream("src\\test\\resources\\gmail.properties"));
		String property=prop.getProperty(sprop);
		return property;
	}
	public String excelRead(int icol,int irow,int ishhet) throws BiffException, IOException
	{
		FileInputStream fis=new FileInputStream("TestData/gmailExcel.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet s=wb.getSheet(ishhet);
		Cell val=s.getCell(icol,irow);
		String a=val.getContents();
		return a;
	} 
	public String getText(String sprop) {
		String a="";
		if(sprop.startsWith("//")){
			a=driver.findElement(By.xpath(sprop)).getText();
		}else {
			a=driver.findElement(By.id(sprop)).getText();
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
