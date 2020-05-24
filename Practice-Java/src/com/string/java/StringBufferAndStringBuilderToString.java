package com.string.java;

public class StringBufferAndStringBuilderToString {

	public static void main(String[] args) {
		StringBuffer stb=new StringBuffer("Geek");
		StringBuilder sbl=new StringBuilder("Hello");
		//conversion from stringbuffer object to string
		String str=stb.toString();
		System.out.println("StringBuffer object to string: ");
		System.out.println(str);
		//conversion from stringbuilder object ot string
		String str1=sbl.toString();
		System.out.println("StringBuilder object to string: ");
		System.out.println(str1);
		//changing stringbuffer object stb
		//but string object doesn't change
		stb.append("ForGeeks");
		System.out.println(stb);
		System.out.println(str);

	}

}
