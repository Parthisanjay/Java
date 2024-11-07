package com.pack1;

public class ClasscastExp {
	public static void main(String[] args) {
		try {
			String s="Hello";
			System.out.println(s.charAt(5));
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
		}
		
		try{
			ClasscastA a=new ClasscastA();
			ClasscastB b=(ClasscastB) a;
		}
		catch(Exception c) {
			System.out.println();
		}
		
	}

}
