package exceptionPrograms;

public class C {
	public static void main(String[] args) {
		try {
			int a=5/0;
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
//			System.out.println("AE exception handled");
//			System.exit(0);
		}
		finally {
			System.out.println("Finally block is executing");
		}
	}
}
