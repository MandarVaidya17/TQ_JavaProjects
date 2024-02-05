package com.inheritance;

import java.util.Scanner;

class Student{
	 int sid;
	 String name;
	 
	 public Student() {
		 System.out.println("Student default con");
	 }
	
	public Student(int sid,String name) {
		this.sid=sid;
		this.name=name;
	}
	
	public String toString() {
		return sid+" "+name;
	}
}

class SchoolStud extends Student{
	protected int SchMarks;
	protected String SchName;
	
	public SchoolStud() {
		System.out.println("In SchoolStud default con");
	}
	
	public SchoolStud(int sid,String name,int SchMarks,String SchName) {
		super(sid,name);
		this.SchMarks=SchMarks;
		this.SchName=SchName;
	}
	public String toString() {
		return sid+" "+name+" "+SchMarks+" "+SchName;
	}
	
}

class ClgStud extends Student{
	int clgMarks;
	String clgName;
	
	public ClgStud() {
		System.out.println("In clgstud default con");
	}
	
	public ClgStud(int sid,String name,int clgMarks,String clgName) {
		super(sid,name);
		this.clgMarks=clgMarks;
		this.clgName=clgName;
	}
	public String toString() {
		return sid+" "+name+" "+clgMarks+" "+clgName;
	}
}

public class HiraDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			SchoolStud s1=new SchoolStud(101,"Pablo", 98, "ABC School");
			System.out.println(s1);
			System.out.println("----------------------------------------");
			
			int sid=sc.nextInt();
			String name=sc.next();
			int SchMark=98;
			String SchName="XYZ";
			SchoolStud s=new SchoolStud(sid,name,SchMark,SchName);
			System.out.println(s);
			
			System.out.println("----------------------------------------");

			
			ClgStud c=new ClgStud();
			ClgStud c1=new ClgStud(201, "Sam", 67, "Agasti College");
			System.out.println(c1);
	}

}
