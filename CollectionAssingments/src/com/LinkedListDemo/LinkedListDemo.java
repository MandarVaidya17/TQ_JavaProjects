package com.LinkedListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
//1.	WAP to append the specified element to the end of a linked list
//2.WAP to iterate through all elements in a linked list		
		LinkedList<Integer> num=new LinkedList<Integer>();
		num.add(10);
		num.add(20);
		num.add(99);
		num.add(35);
		num.addFirst(100);
		Iterator<Integer> itr=num.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//		
		System.out.println("----------------------");
		for(int i=0;i<num.size();i++) {
			System.out.println(num.get(i));
		}
		
//4.WAP to iterate a linked list in reverse order.
		System.out.println("-----------------");
		for(int i=num.size()-1;i>=0;i--) {
			System.out.println(num.get(i));
		}
		System.out.println("---------------------");
		System.out.println(num);
		System.out.println(num.reversed());
	//9.	WAP to insert some elements at the specified position into a linked list.	
	//5.	WAP to insert the specified element at the specified position in the linked list.
		System.out.println("----------------");
		num.add(3, 101);
		num.add(4, 43);
		System.out.println(num);
	//7.	WAP to insert the specified element at the front of a linked list.
	//8.	WAP to insert the specified element at the end of a linked list.	
	//6.	WAP to insert elements into the linked list at the first and last position.
		System.out.println("----------------");
		num.addFirst(111);
		num.addLast(999);
		System.out.println(num);
	//10.	WAP to get the first and last occurrence of the specified elements in a linked list.
		System.out.println(num.getFirst());
		System.out.println(num.getLast());
	//11.	WAP to display the elements and their positions in a linked list.
		for(int i=0;i<num.size();i++) {
			System.out.println(num.get(i)+" Position:"+i);
		}
	//12.	WAP to remove a specified element from a linked list
		System.out.println("-------------------------");
		num.remove(3);
		System.out.println(num);
	//13.	WAP to remove first and last element from a linked list.
		
		System.out.println("-------------------");
		System.out.println(num.removeFirst());
		System.out.println(num.removeLast());
		System.out.println(num);
	//14.	WAP to remove all the elements from a linked list.
		System.out.println("--------------------");
		System.out.println(num.removeAll(num));
		System.out.println(num);
		System.out.println("-----------------------------");
	
	LinkedList<String> l1=new LinkedList<String>();
	l1.add("Cow");
	l1.add("Dog");
	l1.add("Cat");
	l1.add("Buffalo");
	System.out.println(l1);
	LinkedList<String> l2=new LinkedList<String>();
	l2.add("Monkey");
	l2.add("Lion");
	l2.add("Tiger");
	System.out.println(l2);
	System.out.println("----------------------------");
	Collections.shuffle(l1);
	System.out.println(l1);
	System.out.println((l2.contains("Lion")));
//	2.	WAP to join two linked lists.
	System.out.println("----------------------------");
	l1.addAll(l2);
	System.out.println(l1);
//	3.	WAP to clone a linked list to another linked list.
	LinkedList<String> l3=new LinkedList<String>(l2);
	LinkedList<String> l4=(LinkedList<String>) l3.clone();
	System.out.println("====================================");
	System.out.println(l4);
	System.out.println(l3);
	System.out.println("--------------------------");
	System.out.println(l1.element());
	System.out.println(l1.peek());
	System.out.println(l1.peekLast());
	System.out.println(l2.equals(l3));
//	System.out.println(l1.containsAll(l2));
	System.out.println("----------------------");
	List<String> al=new ArrayList<String>(l2);
	System.out.println(al);
	System.out.println(l1.isEmpty());
	l2.set(0, "Wolf");
	System.out.println(l2);
	


	
		
		
	}

}
