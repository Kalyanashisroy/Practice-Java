package com.practice.java;
class TrimExam{
	static void verifyTrim() {
		String str = new String("    How are you??   ");
		System.out.println("String before trim: "+str);
		System.out.println("String after trim: "+str.trim());
	}
}
class HashCodeExam{
	public void verifyHashcode() {
		String str = new String("Welcome to Java World!!");
		System.out.println("Hash Code of the String str: "+str.hashCode());
	}
}
public class TrimExample {
	public static void main(String[] args) {
		TrimExam.verifyTrim();
		HashCodeExam te=new HashCodeExam();
		te.verifyHashcode();
	}
}
