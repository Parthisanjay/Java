package com.pack1;

public class Divarray {
	public static void main(String[] args) {
		int arr[]= {30,2,-3,5,45,20,15};
		System.out.println("Elements divisible by 3 and 5 are:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0 && arr[i]%5==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
