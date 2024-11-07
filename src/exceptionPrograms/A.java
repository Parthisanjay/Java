package exceptionPrograms;

public class A {
	public static void main(String[] args) {
		int a=7;
		int b=0;
		try {
		 b=a/0;
		 System.out.println("Next line");//Not reachable statement
		}
//		catch(NullPointerException ae) {
//			System.out.println("Exception handled");
//			}
		catch(ArithmeticException ae) {
		System.out.println("Exception handled");
		}
		finally {
			System.out.println("Finally block executed");
		}
		System.out.println("b value is "+b); // If the Exception is Not handled means only finally block will execute
											// statements after finally block will not execute
											
	}
}
