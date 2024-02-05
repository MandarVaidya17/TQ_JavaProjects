package com.demo.classobject;

import java.util.Scanner;

public class Student3 {
	int id;
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Student3 s1=new Student3();
		Student3 s2=new Student3();
		s1.id=1;
		s1.name="Pablo";
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		//Write a program to demonstrate anonymous object.
		new Student3();
		Student3 s3=new Student3(),s4=new Student3();
		
		
		int i;
		for(i=1;i<=2;i++) {
			System.out.println("Enter id:");
			s3.id=sc.nextInt();
			System.out.println("Enter name");
			s3.name=sc.next();
			System.out.println(s3.id+" "+s3.name);
		}
		
	}

}
