package revision;

public class EvenPos {
	public static void main(String[] args) {
		int []a= {5,6,7,8,9,10};
		System.out.println(a);
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}
	}	
}
