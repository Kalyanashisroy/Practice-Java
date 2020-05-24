package com.collection.java;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Thomas");
		ts.add("Adams");
		ts.add("Kyle");
		ts.add("Smith");
		ts.add("John");
		ts.add("Young");
		ts.add("Smith");
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
