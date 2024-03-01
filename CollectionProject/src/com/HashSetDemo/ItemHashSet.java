package com.HashSetDemo;

import java.util.HashSet;

public class ItemHashSet {
	public static void main(String[] args) {
		HashSet<Item> hs=new HashSet<Item>();
		
		hs.add(new Item(101, "Sugar", 40.0));
		hs.add(new Item(102, "Oil", 120.0));
		for(Item i:hs) {
		System.out.println(i);
		}
	}

}
