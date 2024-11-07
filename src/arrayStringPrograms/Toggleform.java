package arrayStringPrograms;

import java.util.Arrays;

public class Toggleform {
	public static void main(String[] args) {
		//StringBuffer s1=new StringBuffer("good boy");
		String s1="  kutTy kaNnu loVes Venkat bRo  ";
		s1=s1.trim();
		s1=s1.toLowerCase();
		String res="";
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			String up="";
			if(i==0) {
				up=up+c[i];
				up=up.toUpperCase();				
				res=res+up;
			}
			else if(c[i]==' ') {
				up=up+c[i+1];
				up=up.toUpperCase();
				c[i+1]=up.charAt(0);
				res=res+c[i];
			}
			else {
				res=res+c[i];
			}
		}
		System.out.println(res);
		
		
	}
}
