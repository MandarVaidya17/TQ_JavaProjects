package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo5 {
	public static void main(String[] args) {
		
		//3.	Create aarraylist of string. Add 7 days to list ( Monday , Sunday etc)
		//Remove elements from list for which string length is more than 7	
		ArrayList<String> day=new ArrayList<String>();
		day.add("Monday");
		day.add("Tuesday");
		day.add("Wednesday");
		day.add("Thursday");
		day.add("Friday");
		day.add("Saturday");
		day.add("Sunday");
		System.out.println(day);
		Iterator<String> itr=day.iterator();
		while(itr.hasNext()) {
		if(itr.next().length()>=7) {
			itr.remove();
		}	
		}
		System.out.println(day);
		
		//5.	Create arraylist of characters. Remove duplicate characters from the list. E.g. list – 
		//{ ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’}Output should be {‘d’ , ‘g’ , ‘h’}	
		
		ArrayList<Character> cl=new ArrayList<Character>();
		cl.add('d');
		cl.add('g');
		cl.add('h');
		cl.add('d');
		cl.add('d');
		cl.add('h');
		cl.add('g');
		cl.add('a');
		System.out.println(cl);
		for(int i=0;i<cl.size();i++) {
			for(int j=i+1;j<cl.size();j++) {
				if(cl.get(i)==cl.get(j)) {
				cl.remove(j);
				j--;
				}
			}
		}
		//System.out.println(cl);
		ArrayList<Character> c2=new ArrayList<Character>();
		
		Iterator<Character> itr1=cl.iterator();
		while(itr1.hasNext())
		{
			Character c=itr1.next();
			if(cl.contains(c)) {
				//System.out.println(c);
			}
		}
		System.out.println(cl);
		System.out.println(cl.size());
		
		
		
	}

}
