package com.mapdemo.hashmapdemo;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,Double> smap=new HashMap<String, Double>();
		//System.out.println(smap.put("Pablo", 89.0));
		//System.out.println(smap);
		//System.out.println(smap.put("Pablo", 90.9));
		//System.out.println(smap);
		smap.put("Pramod", 80.0);
		smap.put("pradnya", 86.4);
		smap.put("Rushikesh", 67.8);
		smap.put("Amruta", 83.7);
		smap.put(null, null);
		smap.put("Mandar", 87.8);
		smap.put("Gunjan", 65.3);
		
		System.out.println(smap);
		
		
		
	}

}
