package com.practice.java;

public class ConstructorDemo {

	public static void main(String[] args) {
		//Demo d=new Demo(10);
		//System.out.println("d");
		//Demo d1=new Demo(10,20);
		//new ConstructorDemo(10,20);
		fun();
		//new ConstructorDemo().fun(5);
		//new ConstructorDemo().fun("DRUM");
		//new ConstructorDemo().fun(2,56,78);
		
	}
	/*public ConstructorDemo(int i) {
		System.out.println(i);
	}
    public ConstructorDemo(int i, int j) {
		System.out.println(i+" "+j);
	}
    public ConstructorDemo(int i, int j,int k) {
		
	}
	ConstructorDemo(String obj){
		
	}
	*/
	static void fun() {System.out.println("hello one");}
	void fun(int i) {System.out.println("hello two");}
	void fun(String a) {System.out.println("hello three" + a);}
	void fun(int a,int b) {System.out.println("hello four");}	
	void fun(int a,int b,int z) {System.out.println("hello five  " +a +"  "+b +"  "+z);}
		
		
}
