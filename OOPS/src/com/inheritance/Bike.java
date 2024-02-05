package com.inheritance;

public class Bike extends Vehicle {
	String bikeName="Duke",msg;
	
	public Bike() {
		msg="Hello";
	}
	public Bike(String bikeName,int id,String brand) {
		super(id,brand);
		this.bikeName=bikeName;
		
	}
	void display() {
		super.display();
		System.out.println("Name:"+bikeName);
	}
	void show() {
		msg="java";
		System.out.println("msg:"+msg);
		
	}
	public String toString() {
		return "BikeName:"+bikeName+"Details:"+super.toString() ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Bike b1=new Bike();
			b1.display();
			b1.show();
	}

}
