package com.practice.java;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		/*Parent obj1=new Parent();
		obj1.show();
		Parent obj2=new Child();
		obj2.show();
		*/
		int result=add(2,3,4);
		System.out.println("Sum of three int value is :"+result);
		
		int[][] arrInt= {{1,2},{3,4,5},{6,7,8,9,10}};
		for(int i=0;i<arrInt.length;i++) {
			for(int j=0;j<arrInt[i].length;j++) {
				System.out.print(arrInt[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	
	public static int add(int a,int b,int c) {
		return (a+b+c);
	}

}


class Parent{
	void show() {
		System.out.println("Parent's show method");
	}
	
}
class Child extends Parent{
	void show() {
		System.out.println("Child's show method");
	}
	
}
