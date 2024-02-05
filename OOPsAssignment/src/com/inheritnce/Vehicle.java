package com.inheritnce;

public class Vehicle {
		String type,fuelType,brand;
		public Vehicle() {
			// TODO Auto-generated constructor stub
		}
		public Vehicle(String type,String fuelType,String brand) {
			this.type=type;
			this.fuelType=fuelType;
			this.brand=brand;
		}
		public String toString() {
			return type+" "+fuelType+" "+brand;
		}
		
}
