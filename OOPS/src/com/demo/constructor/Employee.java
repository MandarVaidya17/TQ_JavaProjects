package com.demo.constructor;
//in one class we can have only one default contructor
//one class have both constructor... default and parameterized
//default constructor invoked when we call object
public class Employee {

	private int eid;
	private String ename;
	private double esal;
	
	public Employee() {
		System.out.println("Default contructor");
	}
	public Employee(int eid) {
		System.out.println("Parameterized contructor");
	}
	public Employee(int eid,String ename) {
		System.out.println("p2");
	}
}
