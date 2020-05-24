package com.java;

import java.util.Arrays;

public class RemoveDuplicateInArrayExample2 {
	public static int removeDuplicateElements(int arr[],int n) {
		if(n==0||n==1) {
			return n;
		}
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];//changing original array
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		return j;
	}
	public static void main(String[] args) {
		int arr[]= {10,30,20,70,40,80,80,90,50,60};
		Arrays.sort(arr);//sorting array
		int length=arr.length;
		length=removeDuplicateElements(arr, length);//printing array elements
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
