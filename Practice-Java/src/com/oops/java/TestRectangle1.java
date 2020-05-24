package com.oops.java;
class Rectangle1{
	int length;
	int width;
	void insert(int l,int w) {
		length=l;
		width=w;
	}
	void calculateArea() {
		System.out.println(length*width);
	}
}

public class TestRectangle1 {

	public static void main(String[] args) {
		Rectangle1 r=new Rectangle1(),r1=new Rectangle1();//creating two object
		r.insert(20, 5);
		r1.insert(30, 7);
		r.calculateArea();
		r1.calculateArea();

	}

}
