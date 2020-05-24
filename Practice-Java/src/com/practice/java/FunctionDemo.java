package com.practice.java;

class PTest {
	public void a1() {
		System.out.println("Running a1 in PTest");
	}
	public void a2() {
		System.out.println("Running a2 in PTest");
	}
}
class QTest extends PTest{
	public void a1() {
		System.out.println("Running a1 in QTest");
	}
	public void a3() {
		System.out.println("Running a3 in QTest");
	}
	
}
public class FunctionDemo {

	public static void main(String[] args) {
		System.out.println("---------");
		PTest p1=new PTest();
		p1.a1();
		p1.a2();
		System.out.println("---------");
		QTest q1=new QTest();
		q1.a1();
		q1.a2();
		q1.a3();
		
	}
	

}
