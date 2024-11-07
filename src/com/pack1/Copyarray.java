package com.pack1;

import java.util.Arrays;

public class Copyarray {
	public static void main(String[] args) {
		int a[]= {10,2,30,4,50};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
