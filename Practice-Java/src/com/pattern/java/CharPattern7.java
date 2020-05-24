package com.pattern.java;

public class CharPattern7 {

	public static void main(String[] args) {
		String str="ABCD";
		char[] chr=str.toCharArray();
		for(int i=0;i<chr.length;i++) {
			for(int j=i;j>=0;j--) {
				System.out.print(chr[j]);
			}
			System.out.println();
		}
		
	
	
	}

}
