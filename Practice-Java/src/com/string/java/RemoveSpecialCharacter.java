package com.string.java;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String text = "This - word ! has \\ /allot # of % special % characters";
		// remove all the special characters a part of alpha numeric characters
		text = text.replaceAll("[^a-zA-Z0-9]", "");
		// remove all the special characters a part of alpha numeric characters and space
		//text = text.replaceAll("[^a-zA-Z0-9 ]", "");
		// remove all the special characters a part of alpha numeric characters, space and hyphen.
		// Note down the blank space and hyphen just before the ]
		//text = text.replaceAll("[^a-zA-Z0-9 -]", "");
		System.out.println(text);

	}

}
