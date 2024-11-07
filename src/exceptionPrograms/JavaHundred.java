package exceptionPrograms;

class Hundredj extends Exception {
	Hundredj(String s){
		super(s);
	}
}

public class JavaHundred{
	public static void main(String[] args) {
		try {
			m1();
		}
		catch(Hundredj h) {
			h.printStackTrace();
//			System.out.println(h.getMessage());
		}
	}
	public static void m1()throws Hundredj {
		int day=100;
		if(day<=100) {
			throw new Hundredj("Happy 100th day");
		}
		else {
			System.out.println("Not 100th day");
		}
	}
}
