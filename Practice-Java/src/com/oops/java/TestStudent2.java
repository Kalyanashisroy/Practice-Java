package com.oops.java;
class Student2{
	int rollno;
	String name;
	void insertRecord(int r,String n) {
		rollno=r;
		name=n;
	}
	void displayInformation() {
		System.out.println(rollno+" "+name);
	}

}

public class TestStudent2 {
	
	public static void main(String[] args) {
		Student2 s1=new Student2();
		Student2 s2=new Student2();
		s1.insertRecord(110, "Robert");
		s1.displayInformation();
		s2.insertRecord(120, "Brook");
		s2.displayInformation();
	}

}
