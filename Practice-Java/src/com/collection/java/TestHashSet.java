package com.collection.java;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();//Creating hashset and adding elements
		hs.add("Ranatunga");
		hs.add("Chamunda");
		hs.add("Karunaratna");
		hs.add("Murulidharan");
		hs.add("Kalubhutarana");
		hs.add("Mendis");
		hs.add("Karunaratna");
		Iterator<String> itr=hs.iterator();//Traversing elements
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
