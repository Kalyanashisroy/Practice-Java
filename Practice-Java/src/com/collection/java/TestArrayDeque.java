package com.collection.java;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {

	public static void main(String[] args) {
		Deque<String> de=new ArrayDeque<>();//Creating deque adding element
		de.add("Mark Wagh");
		de.add("Stev Wagh");
		de.add("Maxwell");
		de.add("Mark Lyne");
		de.add("Chris Gayle");
		de.add("Chandrapaul");
		
		for(String str : de)//Traversing elements
		{
			System.out.println(str);
		}
		
	}

}
