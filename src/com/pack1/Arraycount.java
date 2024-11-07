package com.pack1;
import java.util.Arrays;
import java.util.Scanner;
public class Arraycount {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Array size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Array length is "+a.length);
		System.out.println(Arrays.toString(a));
		
	}

}
