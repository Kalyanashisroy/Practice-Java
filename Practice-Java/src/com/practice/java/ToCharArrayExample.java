package com.practice.java;

public class ToCharArrayExample {

	public static void main(String[] args) {
		ToCharArrayExample.verifyToCharArray();

	}
	static void verifyToCharArray() {
		String str=new String("Welcome to BeginnersBook.com");
		char[] array=str.toCharArray();
		System.out.print("Content of array :");
		for(char c: array) {
			System.out.print(c);
		}
	}

}
