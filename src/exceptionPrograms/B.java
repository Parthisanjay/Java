package exceptionPrograms;

public class B {
	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());//exception object created
			int a=4/0;//Non reachable statement
		}
		
		catch(ArithmeticException ae) {
			System.out.println("AE exception handled");
		}
		catch(NullPointerException ne) {
			System.out.println("NPE exception handled");
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
	}
}
