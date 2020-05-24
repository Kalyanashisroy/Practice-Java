package com.collection.java;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("Williams");
		lhs.add("Mills");
		lhs.add("Adams");
		lhs.add("David");
		lhs.add("Mills");
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());			
		}

	}

}
