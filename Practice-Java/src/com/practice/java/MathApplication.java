package com.practice.java;

public class MathApplication {

	public static void main(String[] args) {
		operation op=new operation();
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
}
