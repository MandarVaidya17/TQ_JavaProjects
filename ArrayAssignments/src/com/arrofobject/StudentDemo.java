package com.arrofobject;

import java.util.Arrays;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1[]=new Student[1];
		
		
		
		s1[0]=new Student(101, "Pablo",new double[]{60,60,60} ); 
		System.out.println(Arrays.toString(s1));
		s1[0].percentage();
		
		Student s2=new Student(102, "Sanket", new double[] {56,65,40});
		Student s3=new Student(103, "Sid", new double[] {86,65,42});
		Student s4=new Student(104, "Omkar", new double[] {57,69,60});
		Student s5=new Student(105, "Mandar", new double[] {87,89,90});
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println(s5.toString());
		s2.percentage();
		s3.percentage();
		s4.percentage();
		s5.percentage();
		

	}

}
