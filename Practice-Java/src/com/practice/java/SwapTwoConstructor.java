package com.practice.java;

public class SwapTwoConstructor {
	int no;
	SwapTwoConstructor(int no){
		this.no=no;
	}
	// To swap c1 and c2 
	public static void swap(SwapTwoConstructor c1, SwapTwoConstructor c2) 
    { 
        int temp = c1.no; 
        c1.no = c2.no; 
        c2.no = temp; 
    } 

	public static void main(String[] args) {
		
		SwapTwoConstructor c1 = new SwapTwoConstructor(1); 
		SwapTwoConstructor c2 = new SwapTwoConstructor(2); 
	    swap(c1, c2); 
	    System.out.println("c1.no = " + c1.no); 
	    System.out.println("c2.no = " + c2.no); 
	}

}
