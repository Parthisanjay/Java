package com.pack1;
import java.util.Arrays;
import java.util.Scanner;
public class Readarray {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter the Array size");
	int size=s.nextInt();
	char c[]=new char[size];
	System.out.println("Enter the Array elements");
	for(int i=0;i<size;i++)
	{
		c[i]=s.next().charAt(0);
	}
	System.out.println(Arrays.toString(c));
	}

}
