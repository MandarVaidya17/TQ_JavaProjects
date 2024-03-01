package com.HashSetDemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDEmo {
	

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();

		ts.add(90);
		ts.add(45);
		ts.add(89);
		ts.add(78);
		ts.add(90);
		//ts.add(null);
		
		System.out.println(ts);
		System.out.println("----------------------------------");
		
		Iterator<Integer> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

		}
		
		System.out.println("----------------------------------");

		for(Integer i:ts) {
			System.out.println(i);
		}
		System.out.println("----------------------------------");

		Iterator<Integer> itr1=ts.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("----------------------------------");

		NavigableSet<Integer> nm=ts.descendingSet();
		for(Integer i:nm) {
			System.out.println(i);
		}
		System.out.println("----------------------------------");

		Set<Integer> syn=Collections.synchronizedSet(ts);
		System.out.println(syn);
	}

}
