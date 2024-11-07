package grooming;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericArraylist {
	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add(10);
		a.add(20);
		a.add("hi");
		a.add(true);
		System.out.println(a.size());
		//a.toArray();
		
		Object[] o=a.toArray();
		System.out.println(Arrays.toString(o));
		System.out.println(o.length);
		
		
		
	}
}
