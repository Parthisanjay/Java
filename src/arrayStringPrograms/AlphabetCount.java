package arrayStringPrograms;

import java.util.Arrays;

public class AlphabetCount {
	public static void main(String[] args) {
		String s1="Hello";
		String s2=s1.toLowerCase();
		char c[]=s2.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i=0;i<c.length;i++) {
			int count=1;
			if(c[i]!=0) {	
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;
					c[j]=0;
				}
			  }
			System.out.println(c[i]+"-"+count);
			}
		}
	}
}
