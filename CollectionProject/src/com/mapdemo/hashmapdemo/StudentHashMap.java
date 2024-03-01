package com.mapdemo.hashmapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {
	
	static void createMApNames(HashMap<Integer, Student> sm) {
		//String :cource name
		//arraylist :student names
		
		HashMap<String, ArrayList<String>> hm=new HashMap<String, ArrayList<String>>();
		ArrayList<String> names;
		
		for(Map.Entry<Integer, Student> e: sm.entrySet()) {
			String course=e.getValue().getCourse();
			if(hm.containsKey(course)) {
				names=hm.get(course);
//				names.add(e.getValue().getName());
//				hm.put(course, names);
				
			}else
			{
				names=new ArrayList<String>();
//				names.add(e.getValue().getName());
//				hm.put(course, names);
			}
			names.add(e.getValue().getName());
			hm.put(course, names);
		}
		for(Map.Entry<String, ArrayList<String>> e:hm.entrySet()) {
			System.out.println("Course:"+e.getKey());
			for(String s:e.getValue()) {
				System.out.println(s);
			}
			System.out.println(".........................");
		}
	}
	
	public static void main(String[] args) {
		HashMap<Integer, Student> hm=new HashMap<Integer, Student>();
		hm.put(1, new Student(1, "Pablo", 98.9, "Java"));
		hm.put(2, new Student(2, "Anita", 91.7, "Python"));
		hm.put(3, new Student(3, "HArshit", 87.2, "Java"));
		hm.put(4, new Student(4, "Mandar", 95.4, "Python"));
		hm.put(5, new Student(5, "Amar",67.8, "Java"));
		hm.put(6, new Student(6, "Sam", 85.0, "Sql"));
		hm.put(7, new Student(7, "Pradnya", 96.7, "Sql"));
		
		for(Map.Entry<Integer, Student> s:hm.entrySet()) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
		
		createMApNames(hm);
	}

}
