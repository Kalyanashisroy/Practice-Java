package com.pattern.java;

import java.util.Scanner;

public class CaseManipulation {

	 public static String toUpperCase(String inputString) {
			String result="";
			for(int i=0;i<inputString.length();i++) {
				char currentchar=inputString.charAt(i);
				char currentCharToUpperCase=Character.toUpperCase(currentchar);
				result=result+currentCharToUpperCase;
			}
			return result;
		}
	 public static String toLowerCase(String inputString) {
		 String result="";
		 for(int i=0;i<inputString.length();i++) {
			 char currentchar=inputString.charAt(i);
			 char currentCharToLowerCase=Character.toLowerCase(currentchar);
			 result=result+currentCharToLowerCase;
		 }
		 return result;
	 }
	 public static String toToggleCase(String inputString) {
		 String result="";
		 for(int i=0;i<inputString.length();i++) {
			 char currentChar=inputString.charAt(i);
			 if(Character.isUpperCase(currentChar)) {
				 char currentToLowerCase=Character.toLowerCase(currentChar);
				 result=result+currentToLowerCase;
			 }
			 else {
				 char currentToUpperCase=Character.toUpperCase(currentChar);
				 result=result+currentToUpperCase;
			 }
		 }
		 return result;
	 }
	 public static String toCamelCase(String inputString) {
		 String result="";
		 if(inputString.length()==0) {
			 return result;
		 }
		 char firstchar=inputString.charAt(0);
		 char firstCharToUpperCase=Character.toUpperCase(firstchar);
		 result=result+firstCharToUpperCase;
		 for(int i=1;i<inputString.length();i++) {
			 char currentchar=inputString.charAt(i);
			 char previouschar=inputString.charAt(i-1);
			 if(previouschar == ' ') {
				 char currentCharToUpperCase = Character.toUpperCase(currentchar);
				 result=result+currentCharToUpperCase;
			 }
			 else {
				 char currentChartoLowerCase=Character.toLowerCase(currentchar);
				 result=result+currentChartoLowerCase;
			 }
		 }
		 return result;
	 }
	 public static String toSentenceCase(String inputString) {
		 String result="";
		 if(inputString.length()==0) {
			 return result;
		 }
		 char firstchar=inputString.charAt(0);
		 char firstCharToUpperCase=Character.toUpperCase(firstchar);
		 result=result+firstCharToUpperCase;
		 boolean terminalCharacterEncountered=false;
		 char[] terminalCharacters= {'.','?','!'};
		 for(int i=1;i<inputString.length();i++) {
			 char currentChar=inputString.charAt(i);
			 if(terminalCharacterEncountered) {
				 if(currentChar==' ') {
					 result=result+currentChar;
				 }
				 else {
					 char currentCharToUppercase=Character.toUpperCase(currentChar);
					 result=result+currentCharToUppercase;
					 terminalCharacterEncountered=false;
				 }
			 }
				 else {
					 char currentCharToLowerCase=Character.toLowerCase(currentChar);
					 result=result+currentCharToLowerCase;
				 }
				 for(int j=0;j<terminalCharacters.length;j++) {
					 if(currentChar==terminalCharacters[j]) {
						 terminalCharacterEncountered=true;
						 break;
					 }
				 }
			 }
			 return result;
		 }
		 
		 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter an input string: ");
			String inputString=sc.nextLine();
			System.out.println("Upper case: "+ toUpperCase(inputString));
			System.out.println("Lower case: "+toLowerCase(inputString));
			System.out.println("Toggle case: "+toToggleCase(inputString));
			System.out.println("Camel case: "+toCamelCase(inputString));
			System.out.println("Title case: "+toSentenceCase(inputString));
		}
	 }




