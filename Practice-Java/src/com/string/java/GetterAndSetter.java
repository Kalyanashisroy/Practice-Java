package com.string.java;

public class GetterAndSetter {
	private int number;
	public int getNumber() {
		return this.number;
	}
	public void setNumber(int num) {
		this.number=num;
				
	}
	public static void main(String[] args) {
		GetterAndSetter obj=new GetterAndSetter();
		obj.setNumber(10);
		int num=obj.getNumber();
		System.out.println(num);
		}

}


