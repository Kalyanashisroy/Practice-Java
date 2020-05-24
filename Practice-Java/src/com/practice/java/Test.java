package com.practice.java;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String arr[ ]= { "apple","crocodile","bat",};
		//System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
		System.out.println("Unsorted array is " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted array is " +Arrays.toString(arr));
	}
}

