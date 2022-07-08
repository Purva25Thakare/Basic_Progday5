package com.bridzelabz.basics;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		int z;
		Scanner sw = new Scanner(System.in);
		System.out.println("Enter the nos X and Y");
		int x = sw.nextInt();
		int y = sw.nextInt();
		System.out.println("the nos before swapping are" +x+" "+y);
		z=x;
		x=y;
		y=z;
		System.out.println("the nos after swapping are" +x+" " +y);
		
	}
	

}
