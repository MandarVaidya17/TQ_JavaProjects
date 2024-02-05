package com.inheritance;

import com.inheritance.Employee.Manager;

class Employee{
	int id;
	String name;
	double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	
	public String toString() {
		return id+" "+name+" "+salary;
	}
	
public class Manager extends Employee{
	String position,depart;
	
//	public Manager() {
//		
//	}
	public Manager(int id,String name,double salary,String position,String depart) {
		super(id,name,salary);
		this.position=position;
		this.depart=depart;
	}
	public String toString() {
	return position+" "+depart+" "+super.toString(); 
	}
	
}
	
}

public class SuperDemo {

	public static void main(String[] args) {
		
		//Manager m1=new Manager(12, "Mandar", 34000, "dev", "sw");
	}

}
