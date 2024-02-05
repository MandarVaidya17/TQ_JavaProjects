package com.demo.constructor;

class Emp{
	private int id;
	private String name;
	private double salary=10000;
	
	Emp(){
		id=102;
		name="Sam";
		System.out.println("Default constructor");
	}
	
	Emp(int id,String name){
		System.out.println("Parameterized 1");
		this.id=id;
		this.name=name;
	}
	
	Emp(int id,String name,double salary){
		System.out.println("Parameterized 2");
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	public String toString() {
		return "Employee:"+id+" Name:"+name+" salary:"+salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
}

public class Employee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp();
		Emp e2=new Emp(101,"pablo");
		e2.setSalary(50000);
		System.out.println(e2);
		Emp e3=new Emp(102,"Mandar",20000);
		System.out.println(e3);
		
		
		
	}

}
