package com.collection.java;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//creating array list
		list.add("Smith");//adding object in arraylist
		list.add("Kane William");
		list.add("Wills Blake");
		list.add("David");
		//traversing list through iterator
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
