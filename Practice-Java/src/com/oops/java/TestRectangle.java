package com.oops.java;
class Rectangle{
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

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Rectangle r1=new Rectangle();
		r.insert(14, 5);
		r1.insert(20, 8);
		r.calculateArea();
		r1.calculateArea();
		

	}

}
