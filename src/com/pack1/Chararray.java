package com.pack1;

public class Chararray {
	public static void main(String[] args) {
		char c[]= {'1','2','a','b','c','@','$','A','P','S'};
		int num=0;
		int chr=0;
		int spc=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]>='0' && c[i]<='9') {
				num++;
			}
			else if((c[i]>='A' && c[i]<='Z')||(c[i]>='a' && c[i]<='z')) {
				chr++;
			}
			else {
				spc++;
			}
		}
		System.out.println("Numbers: "+num);
		System.out.println("Characters: "+chr);
		System.out.println("Special Characters: "+spc);
	}

}
