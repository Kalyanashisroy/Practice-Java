package com.practice.java;
class IsEmptyExam{
	static void verifyIsEmpty() {
		//empty string
		String str1="";  
		//non-empty string
		String str2="hello";  

		//prints true
		System.out.println(str1.isEmpty());  
		//prints false
		System.out.println(str2.isEmpty()); 
	}
}
class IsEmptyExam1{
	public void verifyIsEmpty1() {
		String str1 = null; 
		String str2 = "beginnersbook";
		if(str1 == null || str1.isEmpty()){
			   System.out.println("String str1 is empty or null"); 
			}
			else{
			   System.out.println(str1);
			}
			if(str2 == null || str2.isEmpty()){
			   System.out.println("String str2 is empty or null");  
			}
			else{
			   System.out.println(str2);
			}
	}
}
public class IsEmptyExample {

	public static void main(String[] args) {
		IsEmptyExam.verifyIsEmpty();
		IsEmptyExam1 iee=new IsEmptyExam1();
		iee.verifyIsEmpty1();

	}

}
