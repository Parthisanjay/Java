package revision;

public class Unboxing {
	public static void main(String[] args) {
		Integer i=26;
		float f=i;//AutoUnboxing(implicit)
		System.out.println(f);
		
		double d=i.doubleValue();//Unboxing(Explicit)
		System.out.println(d);
	}
}
