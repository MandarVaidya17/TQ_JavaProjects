package com.HashSetDemo;

import java.util.Comparator;
import java.util.TreeSet;

class ItemComparator implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		if(o1.getCost()==o2.getCost())
		return o1.getName().compareTo(o2.getName());
		else
			return (int) (o2.getCost()-o1.getCost());
	}
	
}

public class ItemTreeSet {
	public static void main(String[] args) {
		TreeSet<Item> ts=new TreeSet<Item>(new ItemComparator());
		ts.add(new Item(101, "Sugar", 40.0));
		ts.add(new Item(102, "Oil", 120.0));
		ts.add(new Item(104, "Chips", 40.0));
		ts.add(new Item(103, "Dips", 120.0));
		
		for(Item i:ts) {
			System.out.println(i);
		}
	}

}
