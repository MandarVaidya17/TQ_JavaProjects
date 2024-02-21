package com.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
//6.WAP to iterate through all elements in an ArrayList using for each		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(99);
		al.add(199);
	
		for(Integer i:al) {
			System.out.println(i);
		}
//7.	WAP to create a new ArrayList, add some colors (string) and print the collection		
		ArrayList<String> str=new ArrayList<String>();
		str.add("Red");
		str.add(0,"Blue");
		str.add("Black");
		str.add("Orange");
		
		for(String s:str) {
			System.out.println(s);
		}
		System.out.println("----------------------------------");
//8.	WAP to remove element from ArrayList
	//	str.remove(2);
		str.remove("Black");
		for(String s:str) {
			System.out.println(s);
		}
		System.out.println("----------------------------------");
		
//9.	WAP to remove all elements from ArrayList
		al.removeAll(al);
		for(Integer e:al) {
			System.out.println(e);
		}
		System.out.println("----------------------------------");
//10.	WAP to retain all elements from ArrayList
		ArrayList<String> str1=new ArrayList<String>();
		str1.add("Yellow");
		
		System.out.println(str.retainAll(str1));
		System.out.println(str);
		System.out.println("----------------------------------");
	}

}
