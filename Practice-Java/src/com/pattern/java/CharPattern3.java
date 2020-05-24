package com.pattern.java;

import java.util.Scanner;

public class CharPattern3 {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		int length=s.length();
		char [] a=s.toCharArray();
		System.out.println("Printing the pattern: ");
		for(int i=length-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print(a[j]);
			}
			System.out.println();
		}
		
	}

}
