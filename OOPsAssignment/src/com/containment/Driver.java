package com.containment;
//very Car is alloted a Driver having driverid, name, adharNo, salary
public class Driver {
		protected int driverId;
		protected String name;
		protected long adharNo;
		protected double salary;
		
		public Driver() {
			// TODO Auto-generated constructor stub
		}
		public Driver(int driverId,String name,long adharNo,double salary) {
			this.driverId=driverId;
			this.name=name;
			this.adharNo=adharNo;
			this.salary=salary;
		}
		
		public int getDriverId() {
			return driverId;
		}
		public void setDriverId(int driverId) {
			this.driverId = driverId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getAdharNo() {
			return adharNo;
		}
		public void setAdharNo(long adharNo) {
			this.adharNo = adharNo;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String toString() {
			return "Id:"+driverId+" Name:"+name+" AdharNo:"+adharNo+" Salary:"+salary;
		}
		
}
