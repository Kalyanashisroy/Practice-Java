package com.practice.java;

class FormatExam{
	static void verifyFormat() {
		String str = "just a string";
		//concatenating string using format
		String formattedString = String.format("My String is %s", str);  
		/*formatting the value passed and concatenating at the same time
		 * %.6f is for having 6 digits in the fractional part
		 */
		String formattedString1 = String.format("My String is %.6f",12.121);

		System.out.println(formattedString); 
		System.out.println(formattedString1);  
	}
}
class FormatExam1{
	public void verifyFormat1() {
		String str1 = "cool string";
		String str2 = "88";
		/* Specifying argument positions. %1$ is for the first argument and
		 * %2$ is for the second argument
		 */
		String fstr = String.format("My String is: %1$s, %1$s and %2$s", str1, str2);
		System.out.println(fstr);
	}
}
class FormatExam2{
	static void verifyFormat2() {
		int str = 88;
		/* Left padding an integer number with 0's and converting it
		 * into a String using Java String format() method.
		 */
		String formattedString = String.format("%05d", str);
		System.out.println(formattedString);
	}
}
class FormatExam3{
	public void verifyFormat3() {
		String str1 = String.format("%d", 15); // Integer value  
		String str2 = String.format("%s", "BeginnersBook.com"); // String  
		String str3 = String.format("%f", 16.10); // Float value  
		String str4 = String.format("%x", 189);  // Hexadecimal value  
		String str5 = String.format("%c", 'P');  // Char value  
		String str6 = String.format("%o", 189); // Octal value
		System.out.println(str1);  
		System.out.println(str2);  
		System.out.println(str3);  
		System.out.println(str4);  
		System.out.println(str5);  
		System.out.println(str6); 
	}
}
public class FormatExample {
	public static void main(String[] args) {
		FormatExam.verifyFormat();
		FormatExam1 fe1=new FormatExam1();
		fe1.verifyFormat1();
		FormatExam2.verifyFormat2();
		FormatExam3 fe2=new FormatExam3();
		fe2.verifyFormat3();
	}
}
