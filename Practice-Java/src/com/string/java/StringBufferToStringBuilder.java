package com.string.java;

public class StringBufferToStringBuilder {

	public static void main(String[] args) {
		StringBuffer stb=new StringBuffer("Geeks");
		//conversion from stringbuffer object to stringbuilder
		String str=stb.toString();
		StringBuilder sbl=new StringBuilder(str);
		System.out.println(sbl);

	}

}
