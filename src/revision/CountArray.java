package revision;

import java.util.Arrays;

public class CountArray {
	public static void main(String[] args) {
		int count=0;
		int a[]= {2,4,5,6,7,8};
		System.out.println(a);
		for(int i=0;i<a.length;i++) {
			count++;
		}
		System.out.println("Count of Array is "+count);
		System.out.println(Arrays.toString(a));
	}
}
