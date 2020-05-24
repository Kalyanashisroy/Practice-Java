package com.oops.java;
class Employee{
	int id;
	String name;
	float salary;
	void insert(int i,String n,float s) {
		id=i;
		name=n;
		salary=s;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	
} 

public class TestEmployee {
	public static void main(String[] args) {
		Employee e=new Employee();
		Employee e1=new Employee();
		Employee e2=new Employee();
		e.insert(13, "Paul",3000);
		e1.insert(45, "Smith",4000);
		e2.insert(65,"John",6000);
		e.display();
		e1.display();
		e2.display();
	}

}
