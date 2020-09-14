package com.practice.java;

import java.util.Arrays;
import java.util.List;

public class JoinExample {

	public static void main(String[] args) {
		JoinExample.verifyJoinExam();
		JoinExample je=new JoinExample();
		je.verifyJoinExam1();
	}
	static void verifyJoinExam() {
		//The first argument to this method is the delimiter
		String str=String.join("^","You","Are","Awesome");
		System.out.println(str);
	}
	public void verifyJoinExam1() {
		//Converting an array of String to the list
		List<String> list=Arrays.asList("Steve","Peter","Rick","Abbhey");
		String names=String.join("|", list);
		System.out.println(names);
	}
}
