package com.bridzelabz.basics;

import java.util.Scanner;

public class PowerOf2 {
  
	public static void main(String[] args){
		int num = 2;
		int result=1;
	  Scanner s = new Scanner(System.in);
		System.out.println("The  power  is");
		int power= s.nextInt();
		//while (power != 0) {
			//result *= num;
	   //--power;
		for (int i=1;i<=power;i++)
		{
			result *= num;
		}
			System.out.println("The value of power of 2 is" +result);
		}
}
