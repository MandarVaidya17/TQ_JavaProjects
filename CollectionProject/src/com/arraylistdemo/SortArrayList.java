package com.arraylistdemo;

import java.util.ArrayList;

public class SortArrayList {
	static void sortList(ArrayList<Double> al) {
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)>al.get(j)) {
					double temp=al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);	
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(90.6);
		marks.add(56.5);
		marks.add(56.5);
		marks.add(74.2);
		//marks.add(null);
		marks.add(100.0);
		marks.add(80.0);
		marks.add(67.8);
		
		System.out.println("Before:"+marks);
		
		sortList(marks);
		System.out.println(marks);
	}

}
