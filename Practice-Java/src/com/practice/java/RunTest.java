package com.practice.java;

public class RunTest implements Myinterface{
	public static void main(String[] args) {
		Myinterface obj=new RunTest();
		obj.sayhello();
	}
	public void sayhello() {
		System.out.println("Implementation of sayhello");
	}
}
interface Myinterface{
	public String hello="hi";
	public void sayhello();
}
