package revision;

public class Swap {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;	
		a=a+b+c;
		c=a-(b+c);
		a=a-(b+c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
