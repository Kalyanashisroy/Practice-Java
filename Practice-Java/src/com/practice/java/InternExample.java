package com.practice.java;

public class InternExample {

	public static void main(String[] args) {
		InternExam();
		InternExample ie=new InternExample();
		ie.InternExam1();
		
		
	}
	static void InternExam() {
		String str1 = "beginnersbook";    
		
		/* The Java String intern() method searches the string "beginnersbook"  
		 * in the memory pool and returns the reference of it.
		 */
		String str2 = new String("beginnersbook").intern(); 
		//prints true 
		System.out.println("str1==str2: "+(str1==str2));
	}
	public void InternExam1() {
		String str1 = "Hello";
		//Java automatically interns this	
		String str2 = "Hello";
		//This is same as creating string using string literal		
		String str3 = "Hello".intern();
		//This will create a new instance of "Hello" in memory
		String str4 = new String("Hello");
		String str5 = "Hello";
		if ( str1 == str2 ){
		    System.out.println("String str1 and str2 are same");
		}
		if ( str2 == str3 ){
		    System.out.println("String str2 and str3 are same" );
		}
		if ( str1 == str4 ){
		    //This will not be printed as the condition is not true
		    System.out.println("String str1 and str4 are same" );  
		}
		if ( str3 == str5 ){
		    System.out.println("String str3 and str5 are same" );  
		}
	}

}
