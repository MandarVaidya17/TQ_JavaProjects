package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class iteratArrayList {
	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("Shreyash");
		al.add("Akshata");
		al.add("Mandar");
		al.add("Gunjan");
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("-------------------");
		
		for(String s:al) {
			System.out.println(s);
		}
		System.out.println("-------------------");

		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------------------");

		ListIterator<String> litr=al.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("-------------------");

		ListIterator<String> lit=al.listIterator(al.size());
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
	}

}
