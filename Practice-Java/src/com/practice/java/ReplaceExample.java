package com.practice.java;
class ReplaceExam{
	static void verifyReplace() {
		String str = new String("Site is BeginnersBook.com");
		System.out.print("String after replacing all 'o' with 'p' :" );
		System.out.println(str.replace('o', 'p'));
		System.out.print("String after replacing all 'i' with 'K' :" );
		System.out.println(str.replace('i', 'K'));
	}
}
class ReplaceFirst{
	public void verifyReplaceFirst() {
		String str = new String("Site is BeginnersBook.com");
		System.out.print("String after replacing com with net :" );
		System.out.println(str.replaceFirst("com", "net"));
		System.out.print("String after replacing Site name:" );
		System.out.println(str.replaceFirst("Beginners(.*)", "XYZ.com"));
	}
}
class ReplaceAll{
	static void verifyReplaceAll() {
		String str = new String("My .com site is BeginnersBook.com");
		System.out.print("String after replacing all com with net: " );
		System.out.println(str.replaceAll("com", "net"));
		System.out.print("Replacing whole String: " );
		System.out.println(str.replaceAll("(.*)Beginners(.*)", "Welcome"));
	}
}
public class ReplaceExample {

	public static void main(String[] args) {
		ReplaceExam.verifyReplace();
		System.out.println("=======================================");
		ReplaceFirst rf=new ReplaceFirst();
		rf.verifyReplaceFirst();
		System.out.println("=======================================");
		ReplaceAll.verifyReplaceAll();
		
		
	}

}
