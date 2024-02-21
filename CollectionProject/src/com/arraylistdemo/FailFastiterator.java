package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FailFastiterator {
	public static void main(String[] args) {
		List<String> a1=new ArrayList<String>();
		a1.add("Shreyash");
		a1.add("Akshata");
		a1.add("Mandar");
		a1.add("Gunjan");
		
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals("Mandar")) {
				//a1.add("Rahul");//java.util.ConcurrentModificationException
				int index=a1.indexOf("Mandar");
				//itr.remove();
				a1.set(index, "MandarThinkQ");

			}
		}
		System.out.println(a1);
		
		ListIterator<String> litr=a1.listIterator();
		while(litr.hasNext()) {
			if(litr.next().equals("Mandar")) {
				//a1.add("Rahul");
				litr.add("Rahul");
			}
		}
		System.out.println(a1);
	}

}
