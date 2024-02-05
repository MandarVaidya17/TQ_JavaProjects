package com.inheritance;

public class Vehicle {
		int id;
		String brand="ktm";
		
		public Vehicle() {
			
		}
		public Vehicle(int id,String brand) {
			this.id=id;
			this.brand=brand;
		}
		void display() {
			System.out.println("Detail:"+brand);
		}
		public String toString() {
			return "Id:"+id+" Brand:"+brand;
		}
		
}
