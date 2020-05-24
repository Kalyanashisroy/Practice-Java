package com.practice.java;

public class PassingReturnObject {

	public static void main(String[] args) {
		//sayhallo("Kyle");
	    //int sum=add(5,6,7);
	    //int result=sum*10;
	    //System.out.println(result);
		//int mul1=mul(5,6,7);
		//int mulresult=mul1*2;
		//System.out.println(mulresult);
		//int result=div(21,3);
		//System.out.println(result);
		int result=sub(15,5);
		int result1=result*5;
		System.out.println(result1);
		String name=myMethod();
		System.out.println("My name is: "+name);
	}
	public static void sayhallo(String name) {
		System.out.println("Welcome to You tube: "+name);
	}
	public static int add(int a,int b,int c) {
		//System.out.println(a+b+c);
		return (a+b+c);
	}
	public static int mul(int a,int b,int c) {
		//System.out.println(a*b*c);
		return (a*b*c);
	}
	public static int div(int a,int b) {
		//System.out.println(a/b);
		return (a/b);
	}
	public static int sub(int a,int b) {
		//System.out.println(a-b);
		return (a-b);
	}
	public static String myMethod() {
		
		String name="Will Smith";
		return name;
		
	}
}
