package com.bridzelabz.basics;

import java.util.Scanner;

public class BasicProg1 {
	public static void main(String[] args) {
	 long year;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("The year is:");
	 year=sc.nextLong();
	if(((year % 4 == 0) && (year % 100 != 0 )) || (year % 400 == 0)) 
		System.out.println("The year is a leap year");
	
	else 
		System.out.println("The year is not a leap year");
	
	}
	
}