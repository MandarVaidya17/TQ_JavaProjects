package com.linklistdemo;

import java.util.LinkedList;

public class LinklistDemo {
	public static void main(String[] args) {
		LinkedList<String> comp=new LinkedList<String>();
		//System.out.println(comp.getFirst());//exception
		System.out.println(comp.peekFirst());
		
		//System.out.println(comp.remove());
		System.out.println(comp.poll());
		
		comp.add("TCS");
		comp.addFirst("HCL");
		System.out.println(comp.offerFirst("Capgemini"));
		comp.add(1,"Dell");
		comp.addLast("Wipro");
		
		System.out.println(comp);
		System.out.println(comp.element());
		System.out.println(comp.getFirst());
		
		System.out.println(comp.getLast());
		
		System.out.println("-----------------------");
		System.out.println(comp.remove());
		System.out.println(comp.remove(2));
		System.out.println();
	}

}
