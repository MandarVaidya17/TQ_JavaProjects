package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionArrayConversion {
	public static void main(String[] args) {
		//convert an array to araylist
		String lang[]= {"Java","C","Python","Angular"};
		
		//1st way
		List<String> al=Arrays.asList(lang);
		System.out.println(al);
		
		//2nd way
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(lang));
		System.out.println(list);
		
		//3rd way
		ArrayList<String> al2=new ArrayList<String>();
		Collections.addAll(al2, lang);
		System.out.println(al2);
		
		
		//arraylist to array
		
		//not type safe
		
		Object[] arr=list.toArray();
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			arr[i]=((String) arr[i]).toUpperCase();
		}
		System.out.println(Arrays.toString(arr));
		
		//type safe
		String str[]=new String[list.size()];
		list.toArray(str);
		
		for(int i=0;i<str.length;i++) {
			str[i]=str[i].toLowerCase();
		}
		System.out.println(Arrays.toString(str));
		
		
	}

}
