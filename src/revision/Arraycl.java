package revision;

import java.util.ArrayList;

public class Arraycl {
	public static void main(String[] args) {
		ArrayList a=new ArrayList <>();
		a.add(1);
		a.add("java");
		a.add(2);
		a.add("sql");
		a.add(3);
		a.add("python");
		System.out.println("a list "+a);
		
		ArrayList b=new ArrayList <>();
		b.add(1);
		b.add("java");
		b.add(4);
		b.add("web");
		b.add(5);
		b.add("Html");
		System.out.println("b list "+b);
		
		a.addAll(b);
		System.out.println(a);
		a.retainAll(b);
		
		System.out.println(a);
		
	}

}
