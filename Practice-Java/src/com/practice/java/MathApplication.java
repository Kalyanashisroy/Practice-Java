package com.practice.java;

public class MathApplication {

	public static void main(String[] args) {
		operation op=new operation();
		int add=op.add(5, 6, 7);
		int addres=add+4;
		System.out.println(addres);
		float mul1=op.mul(4f, 2f);
		float mul2=op.div(4f, 2f);
		float result=mul1+mul2;
		System.out.println(result);
	}

}
class operation {
	float mul(float x,float y) {
		return x*y;
	}
	float div(float x,float y) {
		return x/y;
	}
	int add(int a,int b,int c) {
		return (a+b+c);
	}
}
