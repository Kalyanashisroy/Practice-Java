package com.pattern.java;

public class CharPattern8 {

	public static void main(String[] args) {
		String str="ABCDE";
		char [] chr=str.toCharArray();
		for(int i=chr.length-1;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				System.out.print(chr[j]);
			}
			System.out.println();
		}
				

	}

}
