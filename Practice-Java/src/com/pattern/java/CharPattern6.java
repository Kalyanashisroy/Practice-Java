package com.pattern.java;

public class CharPattern6 {

	public static void main(String[] args) {
		char ch='A';
		int number=7;
		int count=number-1;
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=count;j++)
				System.out.print(" ");
			count--;
			for(int j=1;j<=i;j++)
				System.out.print(ch);
			System.out.println();
			ch++;
		}

	}

}
