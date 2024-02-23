package com.queuedemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		//System.out.println(pq.remove());nullpointerexception
		//System.out.println(pq);
		System.out.println(pq.poll());//null
		pq.add(90);
		pq.add(89);
		//pq.add(null);
		pq.add(78);
		pq.add(56);
		pq.add(78);
		pq.add(59);
		System.out.println(pq);
		
		pq.offer(71);
		
		System.out.println(pq.remove());
		System.out.println(pq);
		System.out.println(pq.poll());;
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.element());

	}

}
