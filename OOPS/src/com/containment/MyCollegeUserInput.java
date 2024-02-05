package com.containment;

import java.util.Scanner;

public class MyCollegeUserInput {
	Scanner sc=new Scanner(System.in);
	public void setUserInput(Student s) {
		System.out.println("enter student id");
		s.setSid(sc.nextInt());
		System.out.println("enter student name");
		s.setSname(sc.next());
		System.out.println("enter student marks");
		s.setMarks(sc.nextDouble());
		
//		Course c=new Course() ;
//		System.out.println("Enter course id");
//		c.setCid(sc.nextInt());
//		System.out.println("enter course name");
//		c.setCname(sc.next());
//		System.out.println("enter course fees");
//		c.setFees(sc.nextDouble());
		
		s.setCourse(new Course());
		System.out.println("Enter course id");
		s.getCourse().setCid(sc.nextInt());
		System.out.println("enter course name");
		s.getCourse().setCname(sc.next());
		System.out.println("enter course fees");
		s.getCourse().setFees(sc.nextDouble());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyCollegeUserInput myclg1=new MyCollegeUserInput();
			 Student s1=new Student();
			 myclg1.setUserInput(s1);
			 System.out.println(s1);
					
	}

}
