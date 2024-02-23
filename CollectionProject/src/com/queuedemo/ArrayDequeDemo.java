package com.queuedemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		ArrayDeque<Boook> adq=new ArrayDeque<Boook>();
		adq.add(new Boook(101, "Alchemist", 250));
		adq.add(new Boook(103, "Limitless", 800));
		adq.add(new Boook(104, "Secret", 420));
		adq.add(new Boook(102, "Life", 450));
		
		//adq.add(null);
		
		for(Boook b:adq) {
			System.out.println(b);
			}
		
		System.out.println("-------------------");
		System.out.println(adq.removeLast());
		
		System.out.println("-----------------------");
		
		for(Boook b:adq) {
			System.out.println(b);
		}
		
		adq.addFirst(new Boook(109, "Brain Power", 900));
		System.out.println("-------------");
		for(Boook b:adq) {
			System.out.println(b);
		}
		System.out.println("------------");
		System.out.println(adq.getFirst());
	}

}
