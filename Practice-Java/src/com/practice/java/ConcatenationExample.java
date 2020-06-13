package com.practice.java;
class ConcatenateExam{
	//One way of doing concatenation
    String str1 = "Welcome";
    public void verifyConcatenate(){
		str1 = str1.concat(" to ");
	    str1 = str1.concat(" String handling ");
		System.out.println(str1);
	}
}
class ConcatenateExam1{
	//Other way of doing concatenation in one line
	String str2 = "This";
    
    public void verifyConcatenate1(){
    
		str2 = str2.concat(" is").concat(" just a").concat(" String");
	    System.out.println(str2);
	}
}
class ConcatenateExam2{
	String mystr=".com";
	String str3="BeginnersBook".concat(mystr);
	public String verifyConcatenate2(String str) {
		
		return str;
		//System.out.println(str3);
	}
}

public class ConcatenationExample {
	public static void main(String[] args) {
		ConcatenateExam ce=new ConcatenateExam();
		ce.verifyConcatenate();
		ConcatenateExam1 ce1=new ConcatenateExam1();
		ce1.verifyConcatenate1();
		ConcatenateExam2 ce2=new ConcatenateExam2();
		String obj=ce2.str3;
		System.out.println(obj+" _ " +" hello ");
		
	}
	
	

}
