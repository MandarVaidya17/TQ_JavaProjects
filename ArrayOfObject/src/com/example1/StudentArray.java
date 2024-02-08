package com.example1;

import java.util.Scanner;

public class StudentArray {
	
	static Scanner sc=new Scanner(System.in);
	static void enterDetails(Student s) {
		System.out.println("Enter id:");
		s.setId(sc.nextInt());
		System.out.println("Enter Name");
		s.setName(sc.next());
		System.out.println("Enter Marks");
		s.setMarks(sc.nextDouble());
		
	}
	
	static void displayAllStudents(Student st[]) {
		for(Student s:st) {
			System.out.println(s);
		}
	}
	
	static void sortMarks(Student st[]) {
		Student stemp=new Student();
		for(int i=0;i<st.length;i++) {
			for(int j=i+1;j<st.length;j++) {
				if(st[i].getMarks()<st[j].getMarks()) {
					stemp=st[i];
					st[i]=st[j];
					st[j]=stemp;
				}
					
			}
		}
	}
	public static void main(String[] args) {
		Student stud[]=new Student[3];
		
		for(int i=0;i<stud.length;i++) {
			stud[i]=new Student();
			enterDetails(stud[i]);
			System.out.println("--------------");
			

		}
		sortMarks(stud);
//		stud[0]=new Student(101, "Pablo", 90);
//		stud[1]=new Student(102, "Pola", 94);
//		stud[2]=new Student(103, "Sam", 87);
//		stud[3]=new Student(104, "Sid", 67);
//		stud[4]=new Student(105, "Mandar", 97);
//		stud[5].setId(11);
//		stud[5].setName("pablo");
//		stud[5].setMarks(44);//with out object create 
		//give exception like nullpointerException
		
//		for(int i=0;i<stud.length;i++) {
//			System.out.println("Enter id:");
//			int id=sc.nextInt();
//			stud[i].setId(sc.nextInt());
//			System.out.println("Enter Name");
//			stud[i].setName(sc.next());
//			System.out.println("Enter Marks");
//			stud[i].setMarks(sc.nextDouble());
//		}
//		
		
		//System.out.println(stud[0].getName());
		System.out.println("--------------------");
		displayAllStudents(stud);
	}

}
