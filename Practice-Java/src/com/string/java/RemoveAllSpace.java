package com.string.java;

public class RemoveAllSpace {

	public static void main(String[] args) {
		String str="India Is My Country";
		String nospacestr=str.replaceAll("\\s", "");//using built in method
		//String nospacestr=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(nospacestr);

	}

}
