package com.practice.java;

public class CountOccurence {

	public static void main(String[] args) {
		String str="Beginner Book";
		//initialize the count to 0
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='B') {
				//increasing the counter value at each occurrence of B
				count++;
			}
		}
		System.out.println("Char 'B' occurred "+count+" times in the string");
	}

}
