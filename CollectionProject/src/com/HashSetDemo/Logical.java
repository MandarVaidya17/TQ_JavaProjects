package com.HashSetDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class Logical {

	public static void main(String[] args) {
		ArrayList<Item> al=new ArrayList<Item>();
		al.add(new Item(101, "Sugar", 40.0));
		al.add(new Item(102, "Oil", 120.0));
		
		
		HashSet<Item> hs=new HashSet<Item>();
		hs.addAll(al);
		
		for(Item i:hs) {
			System.out.println(i);
			}
	}
}
