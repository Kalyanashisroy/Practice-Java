package com.pattern.java;

public class DiamondPatternStar {

	public static void main(String[] args) {
		int number,i,j,count=1;
		number=5;
		count=number -1;
		for(i=1;i<=number;i++) {
			for(j=1;j<=count;j++) 
				System.out.print(" ");
			count--;
			for(j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
		}
		count=1;
		for(i=1;i<=number-1;i++) {
			for(j=1;j<=count;j++)
				System.out.print(" ");
			count++;
			for(j=1;j<=2*(number-i)-1;j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
