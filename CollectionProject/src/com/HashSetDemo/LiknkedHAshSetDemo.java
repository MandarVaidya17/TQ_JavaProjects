package com.HashSetDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LiknkedHAshSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Red");
		lhs.add("Blue");
		lhs.add("Green");
		lhs.add(null);
		System.out.println(lhs.add("Blue"));
		
		
		System.out.println(lhs);
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
