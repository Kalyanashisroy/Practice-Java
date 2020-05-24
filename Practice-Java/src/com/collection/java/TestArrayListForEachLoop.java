package com.collection.java;

import java.util.ArrayList;

public class TestArrayListForEachLoop {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Frank");
		al.add("David");
		al.add("James");
		al.add("Lyne");
		al.add("Eric");
		for(String obj:al)
			System.out.println(obj);
	}

}
