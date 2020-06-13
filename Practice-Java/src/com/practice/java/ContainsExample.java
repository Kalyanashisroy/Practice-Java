package com.practice.java;
class ContainsExam1{
	String str="Do you like watching Game of Thrones";
	public void verifyContains1(){
		
		System.out.println(str.contains("like"));
		System.out.println(str.contains("Like"));
		System.out.println(str.contains("Game"));
		System.out.println(str.contains("Game of"));
		
	}
}
class ContainsExam2{
	String str1="This is an example of contains()";
	public void verifyContains2() {
		if(str1.contains("example")) {
			System.out.println("The word example is found in given string");
		}
		else {
			System.out.println("The word example is not found in given string");
		}
	}
}
class ContainsExam3{
	String str2="Just a SIMPLE STRING";
	String str3="string";
	public void verifyContains3() {
		System.out.println(str2.toLowerCase().contains(str3.toLowerCase()));
		System.out.println(str2.toUpperCase().contains(str3.toUpperCase()));
	}
}
public class ContainsExample {

	public static void main(String[] args) {
		ContainsExam1 ct1=new ContainsExam1();
		ct1.verifyContains1();
		ContainsExam2 ct2=new ContainsExam2();
		ct2.verifyContains2();
		ContainsExam3 ct3=new ContainsExam3();
		ct3.verifyContains3();
	}

}
