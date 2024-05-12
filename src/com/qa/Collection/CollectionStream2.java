package com.qa.Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionStream2 {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(0);
		l1.add(20);
		l1.add(13);
		l1.add(25);
		l1.add(6);
		l1.add(5);
		List<Integer> l2=new ArrayList<Integer>();
		for(Integer i:l1) {
			if(i%2==0) {
				l2.add(i);
			}
			}
		System.out.println(l2);

	}

}
