package com.bridzelabz.basics;

import java.util.Scanner;

public class Harmonic {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		float har = 1;
		for (int i=2;i<=num;i++)
		{
			har += (float)1/i;
	}
	System.err.println("Harmonic no is" +har);
	}

}
