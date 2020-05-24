package com.practice.java;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class college {
	void f(){}
	}
class five {
	ArrayList<String> runfunct(){
	ArrayList<String> al=new ArrayList<String>();
			al.add("Smith");
			al.add("David");
			al.add("Kane");
			al.add("Rocky");
			al.add("Robert");
			al.add("Brown");
			al.add("Lyne");
			
			//al.clear();
			//al.add("Robert");
	        return al;
	}
}	 
class sixroom{
	sixroom(){
		
	}
	void g() {
		
	}
	void gari(sixroom gg) {
		System.out.println("Hello");
				
	}
}
class hashset {
	Set<String> fun(){
	Set <String> s = new HashSet<String>();
	s.add("apple");
	s.add("banana");
	s.add("kolkata");
	return s;
	
	}
}

public class RunTest2 {
	String Name;
	RunTest2(String name){
		Name=name;
	}
	public static void main(String[] args) {
		//School1 sc=new School1("Rocky");
		//System.out.println(sc.Name);
		/*five f=new five();
		ArrayList<String> obj=f.runfunct();
		System.out.println(obj.get(3));*/
		//sixroom sr1=new sixroom();
		//sixroom sr2=new sixroom();
		//sr1.gari(sr2);
		hashset hs=new hashset();
		Set<String> obj=hs.fun();
		ArrayList<String> al=new ArrayList<String>(obj);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
			
	}
}
