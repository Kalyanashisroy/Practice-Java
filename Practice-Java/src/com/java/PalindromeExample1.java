package com.java;

import java.util.Scanner;

public class PalindromeExample1 {

	public static void main(String[] args) {
		String original,reverse="";//Objects of string class
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original=in.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--)
			reverse=reverse+original.charAt(i);
		if(original.equals(reverse))
			System.out.println("Enter string/number is a palindrome");
		else
			System.out.println("Enter string/number isn't a palindrome");

	}

}
