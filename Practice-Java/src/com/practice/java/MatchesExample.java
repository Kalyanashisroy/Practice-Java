package com.practice.java;

public class MatchesExample {

	public static void main(String[] args) {
		//verifyMatches();
		MatchesExample me=new MatchesExample();
		me.verifyMatches();
	}
	public void verifyMatches() {
		String str = new String("Java String Methods");
		System.out.print("Regex: (.*)String(.*) matches string? " );
		System.out.println(str.matches("(.*)String(.*)"));
		System.out.print("Regex: (.*)Strings(.*) matches string? " );
		System.out.println(str.matches("(.*)Strings(.*)"));

		System.out.print("Regex: (.*)Methods matches string? " );
		System.out.println(str.matches("(.*)Methods"));
	}
}
