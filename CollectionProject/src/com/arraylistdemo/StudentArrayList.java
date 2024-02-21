package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentArrayList {
	public static void main(String[] args) {
		List<Student> slist=new ArrayList<>();
		slist.add(new Student(1, "Pablo", 80));
		slist.add(new Student(1, "Fablo", 80));
		slist.add(new Student(2, "Amar", 90.3));
		slist.add(new Student(3, "Mandar", 99.6));
		slist.add(new Student(4, "Samar", 98.2));
		
		//System.out.println(slist);
		
		for(Student s:slist) {
			System.out.println(s);
		}
		System.out.println("--------------------------");
		Collections.sort(slist);
		
		for(Student s:slist) {
			System.out.println(s);
		}
	}

}
