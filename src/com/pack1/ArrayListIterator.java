package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	public static void main(String[] args) {
		ArrayList names=new ArrayList();
		names.add("Partha");
		names.add("Sanjay");
		System.out.println(names);
		
		Iterator i=names.iterator();
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		
	}

}
