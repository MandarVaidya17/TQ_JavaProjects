package com.inheritance;

class Vehicle1{
	private int vno;
	private String model;
	protected double price;
	
//	public Vehicle() {
//		
//	}
	public Vehicle1(int vno,String model,double price) {
		this.vno=vno;
		this.model=model;
		this.price=price;
	}
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String toString() {
		return vno+" "+model+" "+price;
	}
}

class Car extends Vehicle1{
	protected int noOfGears;
	private String fuelName;
	
	public Car(int vno, String model, double price,int noOfGears,String fuelName) {
		super(vno, model, price);
		this.noOfGears=noOfGears;
		this.fuelName=fuelName;
	}

	public String getFuelName() {
		return fuelName;
	}

	public void setFuelName(String fuelName) {
		this.fuelName = fuelName;
	}
	public String toString() {
		return super.toString()+" "+noOfGears+" "+fuelName;
	}
	
}
class Supercar{
	private int topSpeed;
	private double mileage;
	public Supercar(int vno, String model, double price,int noOfGears,String fuelName,int topSpeed,double mileage) {
		//super(vno,model,price,noOfGears,fuelName);
		this.topSpeed=topSpeed;
		this.mileage=mileage;
		
	}
	
	
}

public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car(12, "m4", 4555667, 6, "petrol");
		System.out.println(c);
	}

}
