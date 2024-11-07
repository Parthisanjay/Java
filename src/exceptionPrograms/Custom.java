package exceptionPrograms;

class ParthaException extends Throwable{
	ParthaException(String s){
		super(s);
	}
	public String getMessage() {//Override
		return "Java";
	}
}

public class Custom {
	public static void main(String[] args) {
		try {
			m1();
		}
		catch(ParthaException p) {
			p.printStackTrace();
		}
	}
	public static void m1()throws ParthaException {
		throw new ParthaException("Hello PARTHA");
	}
}
