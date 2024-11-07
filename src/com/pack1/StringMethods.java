package com.pack1;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		String s="Hi I am good";
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(0));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 9));
		System.out.println(s.trim());
		//Convert a String into Array
		char c[]=s.toCharArray();
		System.out.println(Arrays.toString(c));
		String s1[]=s.split(" ");
		System.out.println(Arrays.toString(s1));
		System.out.println(s.indexOf('o'));
	}
}
