package com.mapdemo.hashmapdemo;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(1, "Alex");
		tm.put(6, "java");
		tm.put(4, "John");
		tm.put(8, "Chris");
		tm.put(3, "Tim");
			
		System.out.println(tm);
		
		System.out.println("Fist key:"+tm.firstKey());
		System.out.println("last key:"+tm.lastKey());

		SortedMap<Integer ,String> s1=tm.subMap(3, 6);//3 include 6 exclude
		System.out.println(s1);
		
		SortedMap<Integer, String> s2=tm.headMap(3);//entries before 3 and 3 is exclude
		System.out.println(s2);
		
		SortedMap<Integer, String> s3=tm.tailMap(3);//antries after 3 and 3 is include
		
		System.out.println(s3);
		
		System.out.println("--------------------------------");
		
		//navigable map
		
		System.out.println("Lower key:"+tm.lowerKey(4));//strictly less
		System.out.println("Floor key:"+tm.floorKey(4));//less or equal to
		System.out.println("Higher key:"+tm.higherKey(4));//Strictly higher
		
		System.out.println("Ceiling key:"+tm.ceilingKey(7));//equal to or greater than
		
		SortedMap<Integer ,String> s4=tm.subMap(3, false, 6, true); //3 exclude 6 include
		System.out.println(s4);
		
		SortedMap<Integer, String> s5=tm.headMap(3, true);//by defalt: entries before 3 and 3 is include
		System.out.println(s5);
		
		SortedMap<Integer, String> s6=tm.tailMap(3,false);//entries after 3 and 3 is exclude
		System.out.println(s6);
	}

}
