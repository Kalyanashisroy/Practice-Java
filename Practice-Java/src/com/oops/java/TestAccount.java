package com.oops.java;
class Account{
	int acc_no;
	String name;
	float amount;
	void insert(int a,String n, float amt) {
		acc_no=a;
		name=n;
		amount=amt;
	}
	void deposit(float amt) {
		amount=amount+amt;
		System.out.println(amt+" deposited");
		
	}
	void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("Insiffient balance");
		}
		else {
			amount=amount-amt;
			System.out.println(amt+" withdrawn");
		}
	}
	void checkbalance() {
		System.out.println("Balance is: "+amount);
	}
	void display() {
		System.out.println(acc_no+" "+name+" "+amount);
	}
}

public class TestAccount {

	public static void main(String[] args) {
		Account a=new Account();
		a.insert(12564, "Robert", 50000);
		a.display();
		a.checkbalance();
		a.deposit(4000);
		a.checkbalance();
		a.withdraw(15000);
		a.checkbalance();

	}

}
