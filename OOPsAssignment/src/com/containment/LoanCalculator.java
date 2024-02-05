package com.containment;
//You have to build a loan calculator.
//If a single rate of interest is provided then it is a housing loan 
//and loan is principal amount * (100 + rate) 
//If two values are provided then it is a commercial loan 
//and loan is principal amount * (value 1 + value 2 +100)
 class Calculator{
	 private double value1,value2,totalamount,pamount,rate;
	 	
	 	public Calculator(){
	 		
	 	}
	 	public Calculator(double pamount) {
	 		this.pamount=pamount;
	 		
	 	}
	 	public double totalamount(double rate) {
	 		totalamount=pamount * (100 + rate);
	 		return totalamount;
	 	}
	 	public double totalamount(double value1,double value2) {
	 		totalamount=pamount * (value1 + value2 +100);
	 		return totalamount;
	 	}
		public double getValue2() {
			return value2;
		}
		public void setValue2(double value2) {
			this.value2 = value2;
		}
		public double getValue1() {
			return value1;
		}
		public void setValue1(double value1) {
			this.value1 = value1;
		}
		public double getRate() {
			return rate;
		}
		public void setRate(double rate) {
			this.rate = rate;
		}
	 	
	 	
 }
public class LoanCalculator {
		
		public static void main(String[] args) {
			Calculator c1=new Calculator(1500.40);
			System.out.println("Home Loan "+c1.totalamount(0.05));
			System.out.println("Commercial loan "+c1.totalamount(0.05,0.8));
			
		}
		
}
