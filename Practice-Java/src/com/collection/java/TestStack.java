package com.collection.java;

import java.util.Iterator;
import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack<String> st=new Stack<String>();
		st.push("Kane");
		st.push("Jamison");
		st.push("Watling");
		st.push("Boult");
		st.push("Henry");
		st.push("Michel");
		st.pop();
		
		Iterator<String> itr=st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
