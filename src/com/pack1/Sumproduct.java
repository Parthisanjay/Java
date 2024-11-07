package com.pack1;

public class Sumproduct {
	public static void main(String[] args) {
		int a[]= {2,3,1,4,8,5,2,7,5};
		int sum=0,pro=1;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			pro=pro*a[i];
		}
		System.out.println("Sum of array is: "+sum);
		System.out.println("Product of array is: "+pro);
	}

}
