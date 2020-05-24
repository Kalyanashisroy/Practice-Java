package com.string.java;

public class StringToStringBufferAndStringBuilder {

	public static void main(String[] args) {
		String str="Geeks";
		//conversion from string to stringbuffer
		StringBuffer stb=new StringBuffer(str);
		stb.reverse();
		System.out.println(stb);
		//conversion from string to stringbuilder
		StringBuilder sbl=new StringBuilder(str);
		sbl.append("ForGeeks");
		System.out.println(sbl);

	}

}
