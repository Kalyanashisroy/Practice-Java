package com.oops.java;
class Student1{
	int id;
	String name;
}
public class TestStudent1 {
	int id;
	String name;
	public static void main(String[] args) {
		//Creating object
		Student1 s=new Student1();
		Student1 s1=new Student1();
		//initializing object
		s.id=100;
		s.name="Micheal";
		s1.id=101;
		s1.name="David";
		//printing data
		System.out.println(s.id+" "+s.name);//printing member with white space
		System.out.println(s1.id+" "+s1.name);
	}

}
