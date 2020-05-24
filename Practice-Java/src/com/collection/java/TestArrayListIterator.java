package com.collection.java;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Tom");
		al.add("Paul");
		al.add("Ricky");
		al.add("Myke");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}

}
