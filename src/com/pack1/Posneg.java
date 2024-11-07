package com.pack1;

public class Posneg {
	public static void main(String[] args) {
		int a[]= {-1,2,-5,4,7,-3,-2};
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				System.out.println("Positive element: "+a[i]);
			}
		}	
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				System.out.println("Negative element: "+a[i]);
			}
		}
	}

}
