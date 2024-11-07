package exceptionPrograms;

public class D {
	public static void main(String[] args){
		try {
		m1();
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("AE exception handled");
		}
		catch(NullPointerException np) {
			System.out.println("NPE exception handled");
		}
	}
	
	public static void m1()throws ArithmeticException
	{
		int a=2/0;
		String s=null;
		System.out.println(s.length());
	}
}
