package com.collection.java;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("Tomy");
		pq.add("David");
		pq.add("Adam");
		pq.add("John");
		pq.add("Kyle");
		pq.add("Smith");
		pq.add("Henry");
		pq.add("Williams");
		System.out.println("head:"+pq.element());
		System.out.println("head:"+pq.peek());
		System.out.println("Iterating the queue elements:");
		Iterator<String> itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		pq.remove();
		pq.poll();
		System.out.println("After removing two elements:");
		Iterator<String> itr1=pq.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
