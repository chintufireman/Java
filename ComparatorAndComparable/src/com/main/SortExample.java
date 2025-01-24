package com.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortExample {
	public static void main(String[] args) {
		ArrayList<Emp> l = new ArrayList<Emp>();
		Emp e1 = new Emp("harsh", 123, 896796);
		Emp e2 = new Emp("durgesh", 1, 98);
		Emp e3 = new Emp("aniket", 4, 463);
		Emp e4 = new Emp("aniket", 3, 908);
		Emp e5 = new Emp("jai", 867, 12);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		
		//comparable example
		/*
		 * System.out.println(l); Collections.sort(l); System.out.println(l);
		 */
		//comparator example
		System.out.println(l);
		//Collections.sort(l, new IdComparator());
		//System.out.println(l);
		Collections.sort(l, new NameComparator().thenComparing(Emp::getId).thenComparing(Emp::getPhno));
		System.out.println(l);
	}
}
