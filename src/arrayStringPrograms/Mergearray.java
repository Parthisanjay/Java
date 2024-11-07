package arrayStringPrograms;

import java.util.Arrays;

public class Mergearray {
	public static void main(String[] args) {
		int a[]= {1,2,10,4,50,4,2,60,20};
		int b[]= {-40,-20,-50};
		int c[]=new int[a.length+b.length];
//		for(int i=0,j=b.length-1,k=a.length+b.length-1;i<a.length+b.length;i++,j--,k--) {
//			if(i<a.length) {
//				c[i]=a[i];
//			}
//			if(k>a.length-1) {
//				c[k]=b[j];
//			}
//		}
		for(int i=0,j=0;i<a.length+b.length;i++) {
			if(i<a.length) {
				c[i]=a[i];
			}
			if(i>=a.length) {
				c[i]=b[j++];
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
