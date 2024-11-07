package com.pack1;

public class NullpointerExp {
	public static void main(String[] args) {
		try{
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println("Exception Handled ..!...");
		}
	}

}
