package com.mapdemo.hashmapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LogicalQues {
	static void createMap(ArrayList<String> names) {
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for(String n:names) {
			if(hm.containsKey(n)) {
				hm.put(n, hm.get(n)+1);
//				int count=hm.get(n);
//				count++;
//				hm.put(n, count);
			}
			else
			{
				hm.put(n, 1);
			}
		}
		for(Map.Entry<String, Integer> en:hm.entrySet()) {
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}
	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		str.add("Mandar");
		str.add("Pravin");
		str.add("Mandar");
		str.add("Rushikesh");
		str.add("Mandar");
		str.add("Harshit");
		str.add("Rushikesh");
		str.add("Rushikesh");
		str.add("Amruta");
		str.add("Rushikesh");
		
		createMap(str);
	}

}
