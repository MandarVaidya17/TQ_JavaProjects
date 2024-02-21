package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
//WAP to add elements to arraylist without using generics (no <>) and print content of it where Integer is used. 
//In second arraylist String is used		
		ArrayList str=new ArrayList();
		str.add("One");
		str.add("Two");
		str.add("three");
		
			System.out.println(str);
		
		ArrayList num=new ArrayList();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(1,90);
		
		System.out.println(num);
		
//2.	WAP add elements to arraylist without using 
//generics, 0th location keep Integer, 1st location String now print each element and display contents.
		ArrayList al=new ArrayList();
		al.add(0,10);
		al.add(1,"Ten");
		
		System.out.println(al);
//4.	WAP to print all elements of ArrayList using iterator
		
		Iterator<String> itr=str.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		System.out.println("---------------------------");
//5.	WAP to iterate through all elements in an ArrayList using for loop
		
		for(int i=0;i<str.size();i++) {
			System.out.println(str.get(i));
		}
		
	}

}
