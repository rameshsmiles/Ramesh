package com.Pack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	
	public static void main(String[] args) throws IOException {
		
		//Create a File
		File f=new File("C:\\Temp\\selenium.txt");
		/*f.createNewFile();
		
		//Insert data on the file
		FileWriter fw=new FileWriter("C:\\Temp\\selenium.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hi Selenium");
		bw.newLine();
		bw.write("WebDriver Lattest");
		bw.flush();*/
		
		FileReader fr=new  FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		System.out.println(br.readLine());
		System.out.println(br.readLine());
	}
}
