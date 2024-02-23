package com.queuedemo;

import java.util.PriorityQueue;

public class Library {
	public static void main(String[] args) {
		PriorityQueue<Boook> bpq=new PriorityQueue<Boook>(new PriceComparator());
		bpq.add(new Boook(101, "Alchemist", 250));
		bpq.add(new Boook(103, "Limitless", 800));
		bpq.add(new Boook(104, "Secret", 420));
		bpq.add(new Boook(102, "Life", 450));
		
		for(Boook b:bpq) {
			System.out.println(b);
		}
		
	}

}
