package com.pattern.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		char[] letter= {'A','B','C','D','E','F','G','H','I','J','K','L',
				'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int letter_number=0;
		//array of string
		String[] diamond=new String[26];
		//get the letter
		System.out.print("Enter a char between A to Z: ");
		Scanner reader=new Scanner(System.in);
		try {
			char user_letter=reader.next("[A-Z]").charAt(0);
			//search for letter number in the array letter
			for(int i=0;i<letter.length;i++) {
				if(letter[i]==user_letter) {
					letter_number=i;
					break;
				}
			}
			//construct diamond
			for(int i=0;i<=letter_number;i++) {
				diamond[i]="";
				//add initial spaces
				for(int j=0;j<letter_number-i;j++) {
					diamond[i] +=" ";
				}
				//add letter(first time)
				diamond[i] +=letter[i];
				//add space between a letters
				if(letter[i] !='A') {
					for(int j=0;j<2*i-1;j++) {
						diamond[i] +=" ";
					}
					//add letter(second time)
					diamond[i] +=letter[i];
				}
				//draw the first part of the diamond as it's composing
				System.out.println(diamond[i]);
			}
			for(int i=letter_number-1;i>=0;i--) {
				//draw the second part of diamond
				//writing the diamond array in reverse order
				System.out.println(diamond[i]);
			}
		}
		catch(InputMismatchException e) {
			//e.printStackTrace();
			System.out.println("You entered a bad input....please try again");
			System.out.println("Exception ="+e);
		}
		finally {
			reader.close();
		}

	}

}
