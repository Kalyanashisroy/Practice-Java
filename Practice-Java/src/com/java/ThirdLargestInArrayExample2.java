package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLargestInArrayExample2 {
	public static int getThirdLargest(Integer[] a,int total) {
		List<Integer> list=Arrays.asList(a);
		Collections.sort(list);
		int ele=list.get(total-3);
		return ele;
	}
	public static void main(String[] args) {
		Integer a[]= {2,3,6,1,8,9,15,23,5,32,54};
		Integer b[]= {22,44,34,12,34,77,98,67,99,88};
		System.out.println("Third largest: " +getThirdLargest(a, 11));
		System.out.println("Third largest: " +getThirdLargest(b, 10));
		

	}

}
