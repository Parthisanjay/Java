package arrayStringPrograms;

import java.util.Arrays;

public class Panagram {
public static void main(String[] args) {
	String s1="abcdefghijklmnopqrstuvwxyz";
	String s2="App ballcat DogEgg fb good hi java Kilo love man no Partha Quick Red sIm ten Ultra violet wind xerox yummy Zebra";
	String s3=s2.toLowerCase();
	char c[]=s1.toCharArray();
	char d[]=s3.toCharArray();
	int count=0; 
	boolean flag=true;
	
	for(int i=0;i<c.length;i++) {
		for(int j=0;j<d.length;j++) {
			if(c[i]==d[j]) {
				count++;
				break;
			}
		}
		if(c.length==count) {
			flag=false;
			System.out.println("It is Panagram");
		}
	}
	System.out.println(count);
	
	if(flag) {
		System.out.println("Not a Panagram");
	}
//	System.out.println(Arrays.toString(c));
//	System.out.println(Arrays.toString(d));
  }
}
