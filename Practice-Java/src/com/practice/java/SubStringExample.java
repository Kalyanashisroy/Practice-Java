package com.practice.java;
class SubStringExam{
	public void verifySubstring() {
		String str=new String("quick brown fox jumps over the lazy dog");
		System.out.println("Substring starting from index 15:"+str.substring(15));
		System.out.println("Substring starting from index 15 and ending at 20:"+str.substring(15, 20));
		String mystr=new String("Lets learn java");
		System.out.println("substring(1):"+mystr.substring(1));
		System.out.println("substring(1,3):"+mystr.substring(1, 3));
	}
}
public class SubStringExample {

	public static void main(String[] args) {
		SubStringExam ste=new SubStringExam();
		ste.verifySubstring();
		
	}

}
