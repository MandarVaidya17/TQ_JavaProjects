package com.queuedemo;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
//	1.	WAP to create a Queue with Integer objects without using generics
//	2.	WAP to create a Queue with some colors (String) &amp; using generics
//	3.	WAP to create a Queue with user defined class objects &amp; using generics
//	4.	Use 2 different method calls to add elements to a queue.
//	5.	WAP to check if a queue has values
//	6.	WAP to create a Queue with Integer objects without using generics
//	7.	WAP to create a Queue with some colors (String) &amp; using generics
//	8.	WAP to create a Queue using generics and add user defined class objects which does not implement comparable interface.
//	9.	WAP to create a Queue using generics and add user defined class objects which implements comparable interface. Observe order when removing from queue.

	public static void main(String[] args) {
		
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(90);
		q.add(89);
		q.add(78);
		q.add(70);
		
		System.out.println(q);
		
		Queue<String> q1=new PriorityQueue<String>();
		
		q1.add("Red");
		q1.add("Yellow");
		q1.add("Blue");
		System.out.println(q1);
		q1.offer("Pink");
		
		System.out.println(q1.element());
		q1.notify();
		System.out.println(q1);
		
		
		
		
		
		
		
		
	}

}
