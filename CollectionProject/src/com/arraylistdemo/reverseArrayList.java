package com.arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class reverseArrayList {
	
	static void reverseArrL(List<Double> al) {
		int j=al.size()-1;
	//	ArrayList<Double> rev=new ArrayList<Double>();
		for(int i=0;i<al.size()/2;i++) {
			double temp=al.get(i);
			al.set(i, al.get(j));
			al.set(j, temp);
			j--;
		}
	}

	static void revA(List<Double> al) {
		for(int i=0,j=al.size()-1;i<al.size()/2;i++,j--) {
			double temp=al.get(i);
			al.set(i, al.get(j));
			al.set(j, temp);
			j--;
		}
	}
	public static void main(String[] args) {
		List<Double> marks=new ArrayList<Double>();
		marks.add(90.6);
		marks.add(56.5);
		marks.add(56.5);
		marks.add(74.2);
		//marks.add(null);
		marks.add(100.0);
		marks.add(80.0);
		marks.add(67.8);
		
		System.out.println("Before:"+marks);

		reverseArrL(marks);
		//revA(marks);
		System.out.println(marks);
	}

}
