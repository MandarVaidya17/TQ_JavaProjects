package com.interfacedemo;
interface Student{
	void show();
	
	default void display() {
		System.out.println("i am student");
	}
}
interface Teacher{
	void show();
	default void display() {
		System.out.println("i am teacher");
	}
}
public class DiamondProblemDemo implements Student,Teacher {
	@Override
	public void show() {
		System.out.println("School name :agasti");
		
	}
	
	public void display() {
		System.out.println("In school");
		Student.super.display();
		Teacher.super.display();
	}
	public static void main(String[] args) {

		Student s;
		s=new DiamondProblemDemo();
		s.show();
		s.display();

		Teacher t;
		t=new DiamondProblemDemo();
		t.show();
		t.display();
	}

	

}
