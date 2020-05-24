package com.oops.java;

public class Student {
	int id;//field or data member or instance variable
	String name;
	public static void main(String[] args) {
		Student s=new Student();//creating an object of student
		System.out.println(s.id);//accessing member through reference variable
		System.out.println(s.name);

	}

}
