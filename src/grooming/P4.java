package grooming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class P4 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("java");
		a.add("sql");
		a.add(20);
		
		ListIterator li=a.listIterator();
//		System.out.println(li.hasNext());
//		System.out.println(li.next());
//		System.out.println(li.hasNext());
//		System.out.println(li.next());
//		System.out.println(li.hasNext());
//		System.out.println(li.next());
//		System.out.println(li.hasNext());
//		System.out.println(a);
//		System.out.println(li.hasPrevious());
//		System.out.println(li.previous());
//		System.out.println(li.hasPrevious());
//		System.out.println(li.previous());
//		System.out.println(li.hasPrevious());
//		System.out.println(li.previous());
		System.out.println(a);
		System.out.println(li.hasNext());
		System.out.println(li.next());
		System.out.println(li.hasNext());
		System.out.println(li.next());
		li.remove();
		System.out.println(li.hasNext());
		System.out.println(li.next());
		li.remove();
		System.out.println(li.hasNext());
		System.out.println(li.next());
		System.out.println(a);
		System.out.println(li.hasPrevious());
		System.out.println(li.previous());
		System.out.println(li.hasPrevious());
		System.out.println(li.previous());
		System.out.println(li.hasNext());
		System.out.println(li.next());
		System.out.println(li.hasNext());
		System.out.println(li.next());
	
	}
}
