package com.practice.java;

public class School {
	int a=4;
	String student="Smith";

	School(){
		int b=6;
		this.a=b;
		
	}
	School(int a){
		this.a=a;
	}
	int run() {
		int sum=0;
		sum=this.a*5;
		return sum;
	}
	
	public static void main(String[] args) {
		School sc=new School(10);
		System.out.println(sc.a);
		System.out.println(sc.student);
		int res=sc.run();
		System.out.println(res);
	
	}

}
