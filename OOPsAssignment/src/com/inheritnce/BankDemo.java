package com.inheritnce;
//A bank has a principal amount and a rate of interest which is 2%. 
//A savings account has a rate of interest 3% while a current account has 5%. 
//Write a method that displays the rate of interest based on whether 
//the account is default/ savings/ current.

class Bank{
	protected double pAmount,rIn;
	
	public Bank() {
		
	}
	public Bank(double pAmount,double rIn) {
		this.pAmount=pAmount;
		this.rIn=rIn;
	}
	public double getpAmount() {
		return pAmount;
	}
	public void setpAmount(double pAmount) {
		this.pAmount = pAmount;
	}
	public double getrIn() {
		return rIn;
	}
	public void setrIn(double rIn) {
		this.rIn = rIn;
	}
	void display() {
		System.out.println("Default Account,Intrest Rate:"+rIn);
	}
	public String toString() {
		return "PAmount:"+pAmount+" Intrest Rate:"+rIn;
	}
}

class Saving extends Bank{
	public Saving() {
		
	}
	public Saving(double pAmount,double rIn) {
		super(pAmount,rIn);
	}
	void display() {
		System.out.println("Saving Account,Intrest Rate:"+rIn);
	}
	
	public String toString() {
		return "PAmount:"+pAmount+" Intrest Rate:"+rIn;
	}
	
}
class Current extends Bank{
	public Current() {
		
	}
	public Current(double pAmount,double rIn) {
		super(pAmount, rIn);
		
	}
	void display() {
		System.out.println("Current Acount,Intrest Rate:"+rIn);
	}
	public String toString() {
		return "PAmount:"+pAmount+" Intrest Rate:"+rIn;
	}
}

public class BankDemo {

	public static void main(String[] args) {
		Bank b=new Bank(2000,0.2);
		b.display();
		Saving saving=new Saving(30000,0.3);
		saving.display();
		Current c=new Current(60000,0.5);
		c.display();
	}
}
