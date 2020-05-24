package com.practice.java;

import java.util.ArrayList;
import java.util.HashMap;

public class RunTest1 {
/*	static int var, var1;
	static float var2;
	static void runA(){
		int a=10;
		int b = 15;
		float c = 12.5f;
		var=a;
		var1=b;
		var2=c;
				
	}*/
	static ArrayList<Object> runA(){
		ArrayList<Object> al=new ArrayList<Object>();
		int a=10;
		int b=15;
		double c=12.5;
		double d=a+b+c;
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		
		return al;
	}
	public static void main(String[] args) {
		
		/*runA();
		System.out.println(var);
		System.out.println(var1);
		System.out.println(var2);
		*/
		ArrayList<Object> alo=new ArrayList<Object>();
		alo=runA();
		double sum=Double.valueOf(Integer.parseInt(alo.get(0).toString()))+
				Double.valueOf(Integer.parseInt(alo.get(1).toString()))+
				Double.parseDouble(alo.get(2).toString());
		System.out.println("The summation of a,b and c is :"+sum);
		
		
		
		
		
		
		
		/*int i=Integer.parseInt("obj");
		System.out.println(i);
		System.out.println("Value of b is:" +alo.get(1));
		String y="15";
		int j=Integer.parseInt(y);
		System.out.println(j);
		System.out.println("Value of c is:" +alo.get(2));
		String z="12.5";
		double l=Double.parseDouble(z);
		System.out.println(l);
		
		System.out.println(i+j+l);*/
		/*System.out.println("Value of b is:" +alo.get(1));
		System.out.println("Value of c is:" +alo.get(2));
		System.out.println("Value of d is:" +alo.get(3));
		
		ArrayList<Object> alo1=new ArrayList<Object>();
		alo1.add("20");
		alo1.add("30");
		alo1.add("40");
		alo.addAll(alo1);
		System.out.println("After add arraylist is:" +alo);*/
	}

}
