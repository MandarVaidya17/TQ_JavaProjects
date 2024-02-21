package com.arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class BulkMethods {
	public static void main(String[] args) {
		List<String> a1=new ArrayList<String>();
		a1.add("Shreyash");
		a1.add("Akshata");
		a1.add("Mandar");
		a1.add("Gunjan");
		
		System.out.println(a1);
		
		List<String> al2=new ArrayList<String>();
		al2.add("Pradnya");
		al2.add("Amruta");
		
		System.out.println(al2);
		
		//a1.addAll(al2);
		a1.addAll(1, al2);
		
		ArrayList<String> al3=new ArrayList<>();
		al3.add("Shreyash");
		al3.add("Gunjan");
		al3.add("Anita");
		al3.add("Rahul");
		
		System.out.println(a1.containsAll(al3));
		
		System.out.println(a1);
		System.out.println(al3);
		a1.retainAll(al3);
		System.out.println(a1);
	}

}
