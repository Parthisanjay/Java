package grooming;

import java.util.ArrayList;

public class Arraylist2 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("java");
		a.add("sql");
		a.add(10);
		a.add(null);
		a.add(null);
		a.add(false);
		a.add('a');
		System.out.println(a);
		
		ArrayList b=new ArrayList();
		b.addAll(a);
		System.out.println(b);
		
		ArrayList c=new ArrayList(b);
		c.add(20);
		c.add("Html");
		c.add('c');
		System.out.println(c);
			
	}
}
