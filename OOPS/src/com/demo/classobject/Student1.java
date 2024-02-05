package com.demo.classobject;

public class Student1 {
	int rollnum=34;
	String name="Ram";
	
	public void setDetails() {
		rollnum=76;
		name="Sham";
	}
	
	public void displayInfo() {
		System.out.println("RollNum:"+rollnum);
		System.out.println("Name:"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.displayInfo();
		s2.displayInfo();
		
		s3.setDetails();
		s3.displayInfo();
	}
}
