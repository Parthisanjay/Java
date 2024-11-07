package revision;

import java.util.Arrays;

public class Sortingarray {
	public static void main(String[] args) {
		int a[]= {5,3,7,4,1,2,6};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
