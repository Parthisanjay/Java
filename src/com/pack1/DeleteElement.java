package com.pack1;
import java.util.Arrays;
import java.util.Scanner;
public class DeleteElement {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int a[]= {4,5,3,2,7,8,5,4};
		System.out.println("Enter the Index of Element to delete");
		int key=s.nextInt();
		deleteElement(a,key);
		System.out.println(Arrays.toString(a));
	}
	public static void deleteElement(int a[],int key) {
		a[key]=0;
		//System.out.println(Arrays.toString(a));
	}

}
