package com.practice.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Run {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>(Arrays.asList("Smith","David","Kane","Robert"));
		String ob1=al.get(1);
		System.out.println(ob1);
	}

}
