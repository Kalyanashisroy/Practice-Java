package com.practice.java;

class Apple{
		String var="Pencil";
		void fun() {
			System.out.println("I am inside apple fun");	
		}
}
interface Orange{
	String var2="Pineapple";
	void fun(); 
			
	}
class Apple2 implements Orange{
	public void fun() {
		System.out.println("I am inside apple2 fun");
	}
}
public class DemoRun {
	
	public static void main(String[] args) {
		Apple ap=new Apple();
		ap.fun();
		System.out.println("From apple class "+ap.var);
		System.out.println("From interface orange "+Orange.var2);
		Apple2 ap2=new Apple2();
		ap2.fun();
	} 

}
