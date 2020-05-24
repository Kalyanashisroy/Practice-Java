package com.practice.java;
class CompareToExam{
	
	String str1="String method tutorial";
	String str2="compare to method";
	String str3="String method tutorial";
	public void compare(String str1,String str2,String str3) {
	
	int var1=str1.compareTo(str2);
	System.out.println("Compare to str1 and str2 :"+var1);
	int var2=str1.compareTo(str3);
	System.out.println("Compare to str1 and str3 :"+var2);
	int var3=str2.compareTo("compare to method");
	System.out.println("Compare to str2 and string argument comparison :"+var3);
	}
	
}

class CompareToExam1{
	
	String str1 = "Cow"; 
	//This is an empty string
	String str2 = "";
	String str3 = "Goat";
	public void compare1(String str1,String str2,String str3) {
		
	System.out.println(str1.compareTo(str2));

	System.out.println(str2.compareTo(str3));
	}
	
}
class CompareToExam2{
	//uppercase
		String str1 = "HELLO"; 
		//lowercase
		String str2 = "hello";
		public void compare2(String str1,String str2) {
			
		System.out.println(str1.compareTo(str2));
		}
}

public class CompareToExample {

	public static void main(String[] args) {
		CompareToExam cte=new CompareToExam();
		cte.compare("String method tutorial", "compare to method", "String method tutorial");
		CompareToExam1 cte1=new CompareToExam1();
		cte1.compare1("Cow", "", "Goat");
		CompareToExam2 cte2=new CompareToExam2();
		cte2.compare2("HELLO", "hello");
	
	
	
	}
	
	
	    
	    
	    
	    
	
}
