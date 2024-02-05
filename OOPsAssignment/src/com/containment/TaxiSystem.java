package com.containment;

import java.util.Scanner;

public class TaxiSystem {
	
	Scanner sc=new Scanner(System.in);
	
	public void setInputDetails(Car c) {
		System.out.println("Enter Car No:");
		c.setCarNo(sc.nextInt());
		System.out.println("Enter Car Brand");
		c.setBrand(sc.next());
		System.out.println("Enter Car Model");
		c.setModel(sc.next());
		
		c.setDriver(new Driver());
		System.out.println("Enter Driver Id");
		c.getDriver().setDriverId(sc.nextInt());
		System.out.println("Enter Driver Name");
		c.getDriver().setName(sc.next());
		System.out.println("Enter Driver Adhar");
		c.getDriver().setAdharNo(sc.nextLong());
		System.out.println("Enter Drivers Salary");
		c.getDriver().setSalary(sc.nextDouble());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car(9822, "Honda", "Sadan", new Driver(105, "Sam", 9876543, 4500));
		System.out.println(c);
		System.out.println("----------------------------------------");
		
		Car c1=new Car();
		TaxiSystem obj=new TaxiSystem();
		obj.setInputDetails(c1);
		
		System.out.println(c1);
		System.out.println("----------------------------------------");
		
		
	}

}
