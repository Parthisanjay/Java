package com.pack1;

public class StringBoundExp {
	public static void main(String[] args) {
		try {
			String s="Hello";
			System.out.println(s.charAt(5));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Exception Handled");
		}
	}

}
