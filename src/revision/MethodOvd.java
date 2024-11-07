package revision;

public class MethodOvd {
	public static void main(String[] args) {
		short a=1;
		m1(1);
	}
	
	public static void m1(short a) {
		System.out.println("Short executing");
	}
	public static void m1(int a) {
		System.out.println("Int executing");
	}
	public static void m1(short a,int b) {
		System.out.println("3rd method executing");
	}
	public static void m1(int a,short b) {
		System.out.println("4th method executing");
	}
}
