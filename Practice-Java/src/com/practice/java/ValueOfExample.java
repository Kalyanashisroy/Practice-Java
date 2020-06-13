package com.practice.java;

class ValueOfExam{
	/*
	public static String valueOf(boolean b): Used for converting boolean value to a String
	public static String valueOf(char c): char to String
	public static String valueOf(int i): int to String
	public static String valueOf(long l): long to String
	public static String valueOf(float f): float to String
	public static String valueOf(double d): double to String*/
	public void verifyValueOf() {
		int number=23;
		String strn=String.valueOf(number);
		System.out.println(strn+99);
		char vowel[]= {'A','E','I','O','U'};
		String strv=String.copyValueOf(vowel);
		System.out.println(strv);
		int i=10;//int value
		float f=10.10f;//float value
		long l=111L;//long value
		double d=2222.22;//double value
		char ch='A';//char value
		char array[]= {'a','b','c'};//char array
		//converting int to string
		String str1=String.valueOf(i);
		//converting float to string
		String str2=String.valueOf(f);
		//converting long to string
		String str3=String.valueOf(l);
		//converting double to string
		String str4=String.valueOf(d);
		//converting char to string
		String str5=String.valueOf(ch);
		//converting array to string
		String str6=String.valueOf(array);
								
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
	}
}

public class ValueOfExample {

	public static void main(String[] args) {
		ValueOfExam vom=new ValueOfExam();
		vom.verifyValueOf();

	}

}
