package com.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo3 {
	public static void main(String[] args) {
//11.	WAP to know how many elements in ArrayList
		ArrayList<String> str=new ArrayList<String>();
		str.add("Dell");
		str.add("HP");
		str.add("Lenovo");
		
		System.out.println(str.size());
//12.	WAP to test an ArrayList is empty or not
		System.out.println(str.isEmpty());
		
//13.	WAP to empty ArrayList
	
		ArrayList<String> st=new ArrayList<String>();
		System.out.println(st.isEmpty());
//14.	WAP to search an element from ArrayList
		String el="Dell";
		for(String s:str) {
			if(s.equals(el)) {
				System.out.println(s);
			}
		}
		
//15.	WAP to search the specified collection in this collection		
		ArrayList<String> str2=new ArrayList<String>();
		str2.add("Dell");
		str2.add("HP");
		
		if(str.containsAll(str2)) {
			System.out.println("found");
		}else
			System.out.println("not found");
		
//18.	WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)
			
		ArrayList<Integer> num=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		for(Integer i:num) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
//21.	WAP to convert collection into array
		
		String s1[]=new String[str.size()];
		str.toArray(s1);
		System.out.println(Arrays.toString(s1));
		
//22.	WAP of swap two elements in an ArrayList
		Collections.swap(str,0,2);
		for(String s:str) {
			System.out.println(s);
		}
		System.out.println("----------------------------------");
		str.set(0, "Asus");
		for(String s:str) {
			System.out.println(s);
		}
		
	}
	

}
