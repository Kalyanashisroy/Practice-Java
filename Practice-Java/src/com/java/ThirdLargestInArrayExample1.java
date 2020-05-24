package com.java;

import java.util.Arrays;

public class ThirdLargestInArrayExample1 {
	
	public static int getThirdLargest(int[] a,int total)
	{
		Arrays.sort(a);
		return a[total-3];
		
	}
	public static void main(String[] args) {
		int a[]= {2,5,1,3,8,9,10,19};
		int b[]= {44,99,55,22,33,77,24,67,64,92};
		System.out.println("Third largest: "+getThirdLargest(a, 8));
		System.out.println("Third largest: "+getThirdLargest(b, 10));

	}

}
