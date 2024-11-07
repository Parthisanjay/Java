package arrayStringPrograms;

import java.util.Arrays;

public class FirstSecondSmall {
	public static void main(String[] args) {
		int a[]= {6,7,3,2,2,3,6,7,5};
		fsSmall(a);
	}
	public static void fsSmall(int a[]) {
		int first=0;
		int second=0;
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
		first=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]!=a[0]) {
				second=a[i];
				break;
			}
		}
		System.out.println("First smallest element "+first);
		System.out.println("Second smallest element "+second);
	}

}
