package com.pattern.java;

import java.util.Scanner;

public class CharPattern1 {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		char [] a=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a[j]);
			}
			System.out.println();
		}
	}
}
