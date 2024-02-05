package com.demo.classobject;

public class Student {
	
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
		
		System.out.println(s1.name);
		System.out.println(s1.rollnum);
		//if we display variable without giving or initiializing it takes default value
		s1.displayInfo();
		s1.displayInfo();
		
		
	}

}
