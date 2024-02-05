package com.inheritnce;

public class Car extends Vehicle {
	
	int carNO;
	String name;
	 
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(int carNO,String name,String brand,String type,String fuelType) {
		super(brand,type,fuelType);
		this.carNO=carNO;
		this.name=name;
		
	}
	public String toString() {
		return carNO+" "+name+" "+super.toString(); 
	}
	
	public static void main(String[] args) {
		Car c1=new Car(101, "M5","BMW","Sadan", "Petrol");
		System.out.println(c1);
	}
	
	

}
