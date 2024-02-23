package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {
	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		str.add("Mandar");
		str.add("Pablo");
		str.add(0, "Amar");
		str.add(1,"Sid");
		for(String s:str) {
			System.out.println(s);
		}
		ArrayList<String> str2=new ArrayList<String>();
		str2.add("Mandar");
		str2.add("Pablo");
		str2.add(0, "Amar");
		str2.add(1,"Sid");
		
		System.out.println(str.equals(str2));
		
		
		
	}

}
