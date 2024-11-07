package com.pack1;

public class ArithmeticExp {
	public static void main(String[] args) {
		System.out.println("Line at start");
		try {
			int a=7/0;
			System.out.println("Line after Exception");
		}
		catch(ArithmeticException a) {
			System.out.println("Exception Handled..!...");
		}
		System.out.println("Line at end");
	}

}
