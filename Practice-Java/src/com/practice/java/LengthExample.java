package com.practice.java;

class LengthExam {
	static void verifyLength() {
		String str1 = new String("Test String");
		String str2 = new String("Chaitanya");
		String str3 = new String("BeginnersBook");
		System.out.println("Length of str1:" + str1.length());
		System.out.println("Length of str2:" + str2.length());
		System.out.println("Length of str3:" + str3.length());
	}
}
class LengthExam1{
	public void verifyLength1() {
		String str = "hi guys    this is a string";
		
		//length of the String
		System.out.println("Length of the String: "+str.length());
		//length of the String without white spaces
		System.out.println("Length of String without spaces: "+
		str.replace(" ", "").length());
	}
}
public class LengthExample {

	public static void main(String[] args) {
		LengthExam.verifyLength();
		LengthExam1 le=new LengthExam1();
		le.verifyLength1();

	}

}
