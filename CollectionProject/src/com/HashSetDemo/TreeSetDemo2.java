package com.HashSetDemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(90);
		ts.add(34);
		ts.add(45);
		ts.add(89);
		ts.add(78);
		ts.add(65);
		
		System.out.println(ts);
		System.out.println("First:"+ts.first());
		System.out.println(ts.last());
		SortedSet<Integer> s1=ts.subSet(21, 78);
		System.out.println(s1);
		
		System.out.println("lower:"+ts.lower(89));
		System.out.println("floor:"+ts.floor(89));
		
		System.out.println("higher:"+ts.higher(65));
		System.out.println("ceiling:"+ts.ceiling(65));
		System.out.println(ts.headSet(65,true));
		System.out.println(ts.tailSet(65,false));
		System.out.println(ts.subSet(12, true, 78, true));
	}

}
