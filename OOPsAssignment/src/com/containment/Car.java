package com.containment;
//Create a class Car having carNo, brand, model
//every Car is alloted a Driver having driverid, name, adharNo, salary
//We have a Taxi system , Create class where each Car is alloted one driver 
//  > Create an anoymous driver which is been alloted to a car for just one day
//  > Create 3 car having a driver each (taking user input)
//Print the details of car along with the driver

public class Car {
		protected int carNo;
		protected String brand,model;
		Driver driver;
		
		public Car() {
			// TODO Auto-generated constructor stub
		}
		public Car(int carNo,String brand,String model,Driver driver) {
			this.carNo=carNo;
			this.brand=brand;
			this.model=model;
			this.driver=driver;
		}
		public int getCarNo() {
			return carNo;
		}
		public void setCarNo(int carNo) {
			this.carNo=carNo;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand=brand;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model=model;
		}
		public Driver getDriver() {
			return driver;
		}
		public void setDriver(Driver driver) {
			this.driver=driver;
		}
		public String toString() {
			return "CarNo:"+carNo+" Brand:"+brand+" Model:"+model+" Driver Details:\n"+driver;
		}
}
