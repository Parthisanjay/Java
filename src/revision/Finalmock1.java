package revision;

public class Finalmock1 {
	public static void main(String[] args) {
		String s1="QUESTION";
		String s2="ANSWER";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		String res="";
		int size=(c1.length>c2.length)? c1.length:c2.length;
		for(int i=0,j=c2.length-1;i<size;i++,j--) {
			if(i<c1.length) {
				res=res+c1[i];
			}
			if(j>=0) {
				res=res+c2[j];
			}
		}
		System.out.println(res);
	}
}
