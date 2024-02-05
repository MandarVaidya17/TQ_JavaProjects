package com.overriden;

class Person{
	String name;
	public Person() {
		
	}
	public void display(String name) {
		System.out.println("I am person "+name);
	}
	static void show() {
		System.out.println("person india");
	}
}
class Employee extends Person{
	public void display(String name) {
		show();
		System.out.println("I am Employee "+name);
	}
	static void show() {
		System.out.println("Employee indian");
	}
}
class Trainee extends Person{
	public void display(String name) {
		System.out.println("I am Trainee "+name);
		System.out.println("probation period:3 month");
	}
	
}

public class MethodOverriden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Person p=new Person();
			p.display("sam");
			p.show();
			Employee e=new Employee();
			e.display("Pablo");
			//e.show();
			Trainee t=new Trainee();
			t.display("Amar");
			t.show();
	}

}
