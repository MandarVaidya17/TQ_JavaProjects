package com.LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
//1.	WAP to append the specified element to the end of a linked list
//2.WAP to iterate through all elements in a linked list		
		LinkedList<Integer> num=new LinkedList<Integer>();
		num.add(10);
		num.add(20);
		num.add(99);
		num.add(35);
		
		Iterator<Integer> itr=num.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
