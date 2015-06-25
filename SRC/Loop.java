package com.Pack;

public class Loop {
	
	public static void main(String[] args) {
		String[] a=new String[5];
		a[0]="10";
		a[1]="50";
		a[2]="20";
		a[3]="30";
		a[4]="40";
		
		/*for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
		
		for(String temp : a) {
			System.out.println(temp);
		}
		
	}

}
