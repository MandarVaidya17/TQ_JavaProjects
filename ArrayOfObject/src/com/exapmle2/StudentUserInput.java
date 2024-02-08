package com.exapmle2;

import java.util.Scanner;

public class StudentUserInput {
	static Scanner sc=new Scanner(System.in);
	static void enterUserInput(Student s) {
	//	Student s=new Student();
		System.out.println("enter id:");
		s.setSid(sc.nextInt());
		System.out.println("enter sname");
		s.setSname(sc.next());
		System.out.println("Enter the 3 subject marks");
		double m[]=new double[3];
		for(int i=0;i<m.length;i++) {
			m[i]=sc.nextDouble();
		}
		s.setMarks(m);
		
		s.setCourse(new Course());
		System.out.println("enter cid");
		s.getCourse().setId(sc.nextInt());
		System.out.println("enter cname");
		s.getCourse().setCname(sc.next());
	}
	static void displayDetails(Student st[])
	{
		System.out.println("---------------------------------------");
		for(Student s:st)
		{
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student stud[]=new Student[3];
			
			for(int i=0;i<stud.length;i++)
			{
				stud[i]= new Student();
				enterUserInput(stud[i]);
			}
			displayDetails(stud);
	}

}
