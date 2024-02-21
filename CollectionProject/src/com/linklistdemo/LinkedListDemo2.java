package com.linklistdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo2 {
	public static void main(String[] args) {
		
		LinkedList<String> cars=new LinkedList<String>();
		cars.add("Swift");
		cars.add("Baleno");
		cars.addLast("Tiago");
		cars.add("City");
		cars.add("Creta");
		cars.addFirst("Hexa");
		
		for(String s:cars) {
			System.out.println(s);
		}
		System.out.println("--------------------------------");
		System.out.println(cars.remove());
		System.out.println("--------------------------------");
		
		Iterator<String> itr=cars.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------------");
		Iterator<String> itr1=cars.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("--------------------------------");
		ListIterator<String> litr=cars.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("--------------------------------");
		
		
		
		
	}

}
