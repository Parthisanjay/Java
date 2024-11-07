package arrayStringPrograms;

import java.util.Arrays;

public class Vowels {
	public static void main(String[] args) {
		String s1="aeiou";
		String s2="JavaScript";
		String s3=s2.toLowerCase();
		char c[]=s1.toCharArray();
		char d[]=s3.toCharArray();
		int count=0;
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<d.length;j++) {
				if(c[i]==d[j]) {
					d[j]=0;
					count++;
				}
			}
		}
		//char e[]=new char[d.length-count];
		String res="";
		for(int i=0;i<d.length;i++) {
			if(d[i]!=0) {
				res=res+d[i];
				//e[j]=d[i];
				//j++;
			}
		}
		System.out.println(res);
		//System.out.println(Arrays.toString(e));
	}
}
