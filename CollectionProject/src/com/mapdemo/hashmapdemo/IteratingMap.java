package com.mapdemo.hashmapdemo;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratingMap {
	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("India", 91);
		hm.put("USA", 1);
		hm.put("UK", 44);
		hm.put("UAE", 971);
		hm.put("Germany", 49);
		//1st
//		System.out.println(hm);
//	
//		System.out.println("-----------------------------------");
//
//		//all the key
//		Set<String> keys=hm.keySet();
//		for(String k:keys) {
//			System.out.println(k);
//		}
//		System.out.println("-----------------------------------");
//
//		//
//		Iterator<String> itr=keys.iterator();
//		while(itr.hasNext()) {
//			String k=itr.next();
//			System.out.println(k+" :"+hm.get(k));
//		}
//		System.out.println("-----------------------------------");
//
//		//all the values
//		Collection<Integer> pins=hm.values();
//		for(Integer i:pins) {
//			System.out.println(i);
//		}
//		System.out.println("-----------------------------------");
//
//		Set<java.util.Map.Entry<String, Integer>> entries=hm.entrySet();
//		for(java.util.Map.Entry<String, Integer> e:entries) {
//			System.out.println(e.getKey()+"->"+e.getValue());
//
//		}
//		System.out.println("-----------------------------------");
//		System.out.println("-----------------------------------");

		//map
		for(Map.Entry<String, Integer> e:hm.entrySet()) {
			System.out.println(e.getKey()+"->"+e.getValue());
		}
			
	}

}
