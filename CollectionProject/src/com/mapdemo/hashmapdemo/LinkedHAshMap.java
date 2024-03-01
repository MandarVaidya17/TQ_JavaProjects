package com.mapdemo.hashmapdemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHAshMap {
	public static void main(String[] args) {
		LinkedHashMap<String, Double> lhm=new LinkedHashMap<String, Double>(16,0.75f,true);
		
		lhm.put("Rushikesh", 95.9);
		lhm.put("Pramod", 80.0);
		lhm.put("pradnya", 86.4);
		lhm.put("Mandar", 67.8);
		lhm.put("Amruta", 83.7);
		
		for(Map.Entry<String, Double> e:lhm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		System.out.println("--------------------------------");
		System.out.println("Marks of Mandar:"+lhm.get("Mandar"));
		
		System.out.println("---------------------------------");
		
		for(Map.Entry<String, Double> e:lhm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
	}

}
