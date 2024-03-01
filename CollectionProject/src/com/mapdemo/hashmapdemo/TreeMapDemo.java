package com.mapdemo.hashmapdemo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
	
	TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
	tm.put(11, "Alex");
	tm.put(23, null);
	tm.put(67, "John");
	tm.put(98, "Chris");
	tm.put(59, "Tim");
	
	for(Map.Entry<Integer, String> e:tm.entrySet()) {
		System.out.println(e.getKey()+" "+e.getValue());
	}
	
	System.out.println("--------------------------------");
	
	System.out.println(tm);
	
	Set<Entry<Integer, String>> entries=tm.entrySet();
	
	for(Entry<Integer,String> e:entries) {
		System.out.println(e.getKey()+" "+e.getValue());
	}
	
	System.out.println("----------------------------");
	
	NavigableMap<Integer, String> ns=tm.descendingMap();
	for(Map.Entry<Integer, String> e:ns.entrySet()) {
		System.out.println(e.getKey()+" "+e.getValue());
	}
	
	System.out.println("--------------------------");
	
	NavigableSet<Integer> ns1=tm.navigableKeySet();
	for(Integer i:ns1) {
		System.out.println(i+" "+tm.get(i));
	}
	
	}

}
