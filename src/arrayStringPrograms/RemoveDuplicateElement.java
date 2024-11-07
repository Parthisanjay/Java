package arrayStringPrograms;

import java.util.Arrays;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		int a[]= {1,4,2,5,5,7,7,8,6,5,4,1,2};
		System.out.println(Arrays.toString(removeDpl(a)));
	}
	public static int[] removeDpl(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]=0;
				}
			}
		}
		//System.out.println(Arrays.toString(a));
		return a;
	}

}
