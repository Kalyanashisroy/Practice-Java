package com.practice.java;

public class InterfaceWebdriver {
	
	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.webD();

	}
}
	interface WebDriver {
	final String vary="hello webdriver interface";
	abstract void webD();
	}
	class ChromeDriver implements WebDriver{
		public void webD() {}
	}

