package revision;

public class Temp1 {
	public static void main(String[] args) {
		String s="god maN doGGY pluG";
		String res="";
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]==a[0]) {
				a[i]=Character.toUpperCase(a[i]);
			}
			if(a[i]==' ') {
				a[i+1]=Character.toUpperCase(a[i+1]);
			}
			res=res+a[i];
		}
		System.out.println(res);
	}
}
