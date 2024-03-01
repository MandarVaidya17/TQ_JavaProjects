package com.HashSetDemo;

import java.util.HashSet;

public class HashSetDemo2 {
	public static void main(String[] args) {

	HashSet<String> hs= new HashSet<>();
	hs.add("C++");
	hs.add("Angular");
	hs.add("Java");
	hs.add("Spring");
	
	HashSet<String> hs1= new HashSet<>();
	hs1.add("Java");
	hs1.add("C++");
	hs1.add("SQL");
	hs1.add("HTML");
	//mathematic opr
	System.out.println(hs1);
	
	//union 
//	hs.addAll(hs1);
//	System.out.println(hs);
	
	//duffrerence
//	hs.removeAll(hs1);
//	System.out.println(hs);
	
	//intersection common
	hs.retainAll(hs1);
	System.out.println(hs);
	
	}
	
}
