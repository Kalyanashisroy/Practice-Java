package com.pattern.java;

public class CharPattern5 {

	public static void main(String[] args) {
		char ch='A';
		int number=5;
		int count=number-1;
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=count;j++)
				System.out.print(" ");
			count--;
			for(int j=1;j<=2*i-1;j++)
				System.out.print(ch);
			System.out.println();
			ch++;
		}
		count=1;
		ch--;
		for(int i=1;i<=number-1;i++) {
			for(int j=1;j<=count;j++)
				System.out.print(" ");
			count++;
			ch--;
			for(int j=1;j<=2*(number-i)-1;j++)
				System.out.print(ch);
			System.out.println();
			
		}

	}

}
