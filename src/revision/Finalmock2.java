package revision;

import java.util.Arrays;

public class Finalmock2 {
	static char c;
	static int a;
	public static void main(String[] args) {
		String s="a1b2c3d4";
		for(int i=0;i<s.length()-1;i+=2) {
			c=s.charAt(i);
			a=s.charAt(i+1)-48;
//			a=Character.getNumericValue(s.charAt(i+1));
//			a=Integer.parseInt(""+s.charAt(i+1));
			m1(c,a);			
		}
	}
	
	public static void m1(char c,int a) {
		
		for(int i=1;i<=a;i++) {
			System.out.print(c);
		}
	}
}
