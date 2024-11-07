package arrayStringPrograms;

public class Anagramarray {
	public static void main(String[] args) {
		String s1="Radeon";
		String s2="Adreno";
		int count=0;
		boolean flag=true;      
		char c[]=s1.toCharArray();
		char d[]=s2.toCharArray();
		if(c.length==d.length) {
			for(int i=0;i<c.length;i++) {
				String s3=""+c[i];
				for(int j=0;j<d.length;j++) {
					String s4=""+d[j];
					if(s3.equalsIgnoreCase(s4)) {
						d[j]=0;
						count++;
						break;
					}
				}
			}
			if(c.length==count) {
				flag=false;
				System.out.println("Its an Anagram");
			}
		  }
			if(flag) {
				System.out.println("Not an Anagram");
			}
	}
}
