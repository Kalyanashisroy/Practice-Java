package com.java;

public class BubbleSortExample {
	static void bubbleSort(int[] arr) {
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {
					//swap element
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {23,5,15,27,50,75,67,45,100};
		System.out.println("Array before bubble sort");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		bubbleSort(arr);//sorting array element using bubble sort
		System.out.println("Array after bubble sort");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
