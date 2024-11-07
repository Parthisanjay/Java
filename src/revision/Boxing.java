package revision;

public class Boxing {
	public static void main(String[] args) {
		int a=10;//PDT
		System.out.println(a);//10 int
		Integer i=a;//Implicit--->AutoBoxing 
		System.out.println(i);//10 obj
		Float f=Float.valueOf(a);//Explicit--->Boxing
		System.out.println(f);//10.0 obj
	}
}
