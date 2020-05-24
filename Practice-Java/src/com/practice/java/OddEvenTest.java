package com.practice.java;

import java.util.Scanner;

public class OddEvenTest {
	public static boolean hasEight(String number) {
		if(number==null) {
			return true;
		}
		try {
			int i=Integer.parseInt(number);
		}
		catch(NumberFormatException e){
			return false;
			
		}
		return false;
		
	}
	public static boolean isOdd(int number) {
		return true;
		
	}
	public static boolean isEven(int number) {
		return true;
		
	}

	public static void main(String[] args) {
		/*int num;
		System.out.println("Enter an integer number:");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		if(num%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}*/
		System.out.println(OddEvenTest.hasEight(null));
		System.out.println(OddEvenTest.isOdd(8));
		System.out.println(OddEvenTest.isEven(6));
	}

}
