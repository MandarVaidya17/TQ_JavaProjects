package com.hashmapdemo;
//WAP to add elements to a HashMap without 
//using generics (ie do not use <>) and print content of it. Use Integer as Key and 
//String as Value. In second HashMap add elements
//of String type as Key and Integer as Value

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(99, "Pablo");
		m.put(98, "Mandar");
		m.put(10, "Ravi");
		
		System.out.println(m);
	
		Map m1=new HashMap();
		m1.put("Swift", 60);
		m1.put("Harrier", 150);
		m1.put("Polo", 100);
		System.out.println(m1);
		
		System.out.println("-----------------------------------------");
//		3.	WAP to add elements to a HashMap using generics with
//		Integer as Key and String as value. And 4 key-value Map.Entry
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(99, "Pablo");
		hm.put(98, "Mandar");
		hm.put(10, "Ravi");
		hm.put(null, null);
		hm.put(11, "Rushi");
		
		for(Map.Entry<Integer, String> e:hm.entrySet()) {
			System.out.println(e);
		}
		
		System.out.println("-------------------------------------------------");
		
		HashMap<Double, Double> hm1=new HashMap<Double, Double>();
		hm1.put(10.1, 11.3);
		hm1.put(12.3, 13.2);
		hm1.put(11.2, 12.1);
		hm1.put(null, null);
		int count=0;
		for(Map.Entry<Double, Double> e:hm1.entrySet()) {
			count++;
			
		}
		System.out.println("Size count:"+count);
		System.out.println("Size:"+hm1.size());
		System.out.println("--------------------------------");
		
		for(Map.Entry<Integer, String> e:hm.entrySet()) {
			System.out.println("Key:"+e.getKey());
			System.out.println("Value:"+e.getValue());
		}
		System.out.println("------------------------------------------");
		HashMap<Integer, String> hm2=new HashMap<Integer, String>();
		hm2.put(88, "Sagar");
		hm2.put(77, "Pradnya");
		hm2.put(66, "Anita");
		
		hm.putAll(hm2);
		System.out.println(hm);
		
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.containsKey(77));
		System.out.println(hm.get(77));;
		
		System.out.println("------------------------------------------");
		
	}
	
}
