package com.practice.java;

class EndsWithExam {
	static void verifyEndsWith() {
		String str1 = new String("This is a test String");
		String str2 = new String("Test ABC");
		boolean var1 = str1.endsWith("String");
		boolean var2 = str1.endsWith("ABC");
		boolean var3 = str2.endsWith("String");
		boolean var4 = str2.endsWith("ABC");
		System.out.println("str1 ends with String: " + var1);
		System.out.println("str1 ends with ABC: " + var2);
		System.out.println("str2 ends with String: " + var3);
		System.out.println("str2 ends with ABC: " + var4);
	}
}

class EndsWithExam1 {
	public void verifryEndsWith1() {
		String str = "Java String tutorial";
		if (str.endsWith("tutorial")) {
			System.out.println("The Given String ends with tutorial");
		}
	}
}
public class EndsWithExample {

	public static void main(String[] args) {
		EndsWithExam.verifyEndsWith();
		EndsWithExam1 ewe1=new EndsWithExam1();
		ewe1.verifryEndsWith1();
	}

}
