package exceptionPrograms;

public class E {
	public static void main(String[] args) {
		try {
			m1();
		}
		catch(ArithmeticException ae) {
			System.out.println("AE exception handled");
		}
		catch(NullPointerException np) {
			System.out.println("NPE exception handled");
		}
	}
	public static void m1()throws ArithmeticException {
		throw new ArithmeticException();
	//	throw new NullPointerException();
	}
}
