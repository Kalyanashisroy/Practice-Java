package com.practice.java;

class EqualExam{
	static void verifyEqual() {
		String str1= new String("Hello");
		String str2= new String("Hi");
		String str3= new String("Hello");
		System.out.println("str1 equal to str2:"+str1.equals(str2));
		System.out.println("str1 equal to str3:"+str1.equals(str3));
		System.out.println("str1 equal to Welcome:"+str1.equals("Welcome"));
		System.out.println("str1 equal to Hello:"+str1.equals("Hello"));
		System.out.println("str1 equal to hello:"+str1.equals("hello"));
	}
}
class EqualExam1{
	public void verifyEqual1() {
		String str1= new String("Apple");
		String str2= new String("MANGO");
		String str3= new String("APPLE");
		System.out.println("str1 equal to str2:"+str1.equalsIgnoreCase(str2));
		System.out.println("str1 equal to str3:"+str1.equalsIgnoreCase(str3));
		System.out.println("str1 equal to Welcome:"+str1.equalsIgnoreCase("Welcome"));
		System.out.println("str1 equal to Apple:"+str1.equalsIgnoreCase("Apple"));
		System.out.println("str1 equal to mango:"+str2.equalsIgnoreCase("mango"));
		
	}
}
public class EqualExample {

	public static void main(String[] args) {
		EqualExam.verifyEqual();
		System.out.println("===============================");
		EqualExam1 ee=new EqualExam1();
		ee.verifyEqual1();
	}

}
