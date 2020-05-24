package com.collection.java;

import java.util.Iterator;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Trump");
		v.add("Warner");
		v.add("Clark");
		v.add("Kyle");
		Iterator<String> itr=v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
