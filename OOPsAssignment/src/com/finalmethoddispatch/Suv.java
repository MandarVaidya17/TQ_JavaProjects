package com.finalmethoddispatch;
//Create a class Car which has a method displayDetails() whose return type is Car
//Now create a class SUV which has overriden displayDetails()
//Show the usage of Covariant return type in this code
class Car{
	String companyName;
		
		public Car(String companyName) {
			this.companyName=companyName;
		}
		
		Car displayDetails() {
			companyName=companyName+" ";
			return this;
		}
}
public class Suv extends Car{
	
	
	public Suv(String companyName) {
		super(companyName);
		
	}

	Car displayDetails() {
		companyName=companyName+" Hexa";
		return this;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Car c;
			c=new Suv("TATA");
			c.displayDetails();
			System.out.println(c.companyName);
			}

}
