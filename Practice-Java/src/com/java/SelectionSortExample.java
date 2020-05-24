package com.java;

public class SelectionSortExample {
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int index=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;//searching for lowest index
				}
			}
			int smallNumber=arr[index];
			arr[index]=arr[i];
			arr[i]=smallNumber;
		}
	}


	public static void main(String[] args) {
		int[] arr1= {9,14,3,2,43,11,58,22};
		System.out.println("Before selection sort");
		for(int i:arr1)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		selectionSort(arr1);//sorting array using selection sort
		System.out.println("After selection sort");
		for(int i:arr1)
		{
			System.out.print(i+" ");
		}
		
	}

}
