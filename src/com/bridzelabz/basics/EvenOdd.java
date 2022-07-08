package com.bridzelabz.basics;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int x=sc.nextInt();
			if(x % 2 == 0)
			{
				System.out.println("The number is even");
			}
			else {
				System.out.println("The no is odd");
			}
				
	}
	

}
