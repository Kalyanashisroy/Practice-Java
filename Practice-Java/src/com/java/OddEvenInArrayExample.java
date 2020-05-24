package com.java;

public class OddEvenInArrayExample {

	public static void main(String[] args) {
		int a[]= {1,2,5,6,8,9,10,4,7};
		System.out.println("Odd number:");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Even number:");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		

	}

}
