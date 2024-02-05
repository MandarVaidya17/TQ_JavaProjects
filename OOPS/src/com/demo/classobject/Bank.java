package com.demo.classobject;

public class Bank {
	private long accno;
	private String name;
	private double balance;
	
	public void setData(long accno,String name,double balance) {
		this.accno=accno;
		this.name=name;
		this.balance=balance;
	}
	
	public void setAccno(long accno) {
		this.accno=accno;
	}
	public long getAccno() {
		return accno;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public void displayData() {
		System.out.println("AccNo:"+accno);
		System.out.println("Name:"+name);
		System.out.println("Balance:"+balance);
	}
}
