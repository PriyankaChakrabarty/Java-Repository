package com.qa.Collection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		ArrayList l1 = new ArrayList(1000);
		l.add("A");
		l.add(15);
		l.add("F");
		l.add("A");
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		l.add(3, 'P');
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(2));
		System.out.println(l.get(5));
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}

}
