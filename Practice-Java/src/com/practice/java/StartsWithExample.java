package com.practice.java;
class StartsWithExam{
	public void verifyStartsWith(){
		//given string
		String s = "This is just a sample string";  
		//checking whether the given string starts with "This"
		System.out.println(s.startsWith("This"));
		//checking whether the given string starts with "Hi"
		System.out.println(s.startsWith("Hi"));
	}
}
class StartsWithExam1{
	static void verifyStartsWith1() {
		String str= new String("quick brown fox jumps over the lazy dog");
		System.out.println("String str starts with quick:"+str.startsWith("quick"));
		System.out.println("String str starts with brown:"+str.startsWith("brown"));
		System.out.println("substring of str(starting from 6th index) has brown "
				+ "prefix:"+str.startsWith("brown",6));
		System.out.println("substring of str(starting from 6th index) has brown "
				+ "prefix:"+str.startsWith("quick",6));
	}
}
public class StartsWithExample {

	public static void main(String[] args) {
		StartsWithExam swe=new StartsWithExam();
		swe.verifyStartsWith();
		//StartsWithExam.verifyStartsWith();
		StartsWithExam1.verifyStartsWith1();
		
	}

}
