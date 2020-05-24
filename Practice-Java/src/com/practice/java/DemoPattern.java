package com.practice.java;

public class DemoPattern {

	public static void main(String[] args) {
		//tra2(10);
		//tra1(5);
		//tra1b(6);
		//tra3(10);
	    //butterfly(10);
		hollowtra(6);
	}
	static void  hollowtra(int r) {
		//System.out.println("");
		for(int i=0;i<r;i++) {
			for(int j=i;j<r;j++) {System.out.print(" ");}
			System.out.print("*");
			for(int k=0;k<i*2;k++){System.out.print(" ");}
			System.out.print("*");
			System.out.println("");
			
			//for(int k=0;k<i;k++) {System.out.print("y");}
		}
		
		for(int l=0;l<r*2+2;l++) {System.out.print("*");}
		System.out.println("");
		System.out.println("");
	}
	static void butterfly(int r) {
		System.out.println("");
		for(int i=0;i<r;i++) {
			for(int j=0;j<=i;j++ ) {System.out.print("*");}
			for(int k=0;k<(r-i)*2;k++) {System.out.print(" ");}
			for(int j=0;j<=i;j++ ) {System.out.print("*");}
			System.out.println("");
		}
		//------------
		for(int i=0;i<r;i++) {
			for(int j=i;j<=r;j++ ) {System.out.print("*");}
			for(int k=0;k<i*2;k++) {System.out.print(" ");}
			for(int j=i;j<=r;j++ ) {System.out.print("*");}
			System.out.println("");
		}
		
		System.out.print("*");
		for(int i=0;i<2*r;i++) {System.out.print( " ");}
		System.out.print("*");
		System.out.println("");
	}
	static void  tra3(int r) {
		System.out.println("");
		for(int i=0;i<r;i++) { //loop 1
			for(int j=i; j<r;j++) {//loop 2
			System.out.print("*");
			}//loop2
			System.out.println(" ");
		} //loop1
		System.out.println("");
			}
	static void  tra2(int r) {
		System.out.println("");
		for(int i=0;i<r;i++) { //loop 1
			for(int j=i; j<r;j++) {//loop 2
			//	System.out.print("#");
				System.out.print(" ");
				
			}//loop2
			System.out.print("*");
			for(int k=0;k<i*2;k++) {System.out.print("*");}
			//System.out.println("#");
			System.out.println(" ");
		} //loop1
		
		//-------------------------------------------
		System.out.println("");
		System.out.println("");
	}
	static void tra1(int r) {
		System.out.println("");
		for(int i=0;i<r;i++) { //loop 1
			for(int j=i; j<r;j++) {//loop 2
			//	System.out.print("#");
				System.out.print(" ");
				
			}//loop2
			System.out.print("*");
			for(int k=0;k<i*2;k++) {System.out.print("*");}
			//System.out.println("#");
			System.out.println(" ");
		} //loop1
		
		//-------------------------------------------

		for(int i=0;i<r;i++) { //loop 1
			for(int j=0; j<i;j++) {//loop 2
				//System.out.print("#");
				  System.out.print(" ");
				
			}//loop2
			
			for(int k=0;k<=(r-i)*2;k++) {System.out.print("*");}
			
			//System.out.println("#");
			System.out.println(" ");
			
		} //loop1
		
	
				for(int i=0;i<r;i++) {System.out.print(" ");}
				System.out.println("*");
				
				System.out.println("");
				System.out.println("");
	}
	static void tra1b(int r) {
		
		System.out.println("");
		for(int i=0;i<r;i++) { //loop 1
			for(int j=0; j<i;j++) {//loop 2
				//System.out.print("#");
				  System.out.print(" ");
				
			}//loop2
			
			for(int k=0;k<=(r-i)*2;k++) {System.out.print("*");}
			
			//System.out.println("#");
			System.out.println(" ");
			
		} //loop1
		
	
				for(int i=0;i<r;i++) {System.out.print(" ");}
				System.out.println("*");
	
		//-----------------------------------
		for(int i=0;i<r+1;i++) { //loop 1
			for(int j=i; j<r;j++) {//loop 2
			//	System.out.print("#");
				System.out.print(" ");
				
			}//loop2
			System.out.print("*");
			for(int k=0;k<i*2;k++) {System.out.print("*");}
			//System.out.println("#");
			System.out.println(" ");
		} //loop1
		
		//-------------------------------------------
		System.out.println("");
		System.out.println("");
	}

}
