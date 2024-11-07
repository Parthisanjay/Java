package com.pack1;

public class ArrayBoundExp {
	public static void main(String[] args) {
		try {
			int a[]= {1,2,3,4};
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException a) { // or (Throwable a)
			System.out.println("Exception handled");
		}
	}

}
