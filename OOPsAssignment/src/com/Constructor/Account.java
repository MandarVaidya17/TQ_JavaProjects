package com.Constructor;
//Create a class Account containing following methods : 
//insert() to insert account data 
//display() to display account information 
//deposit() to deposit amount 
//withdraw() to withdraw amount 
//checkbalance() to check balance 

import java.util.Scanner;

public class Account {
	int accNo;
	String Name;
	double balance=0,amount;
	static String bankName="HDFX BANK";
	static int intrest=8;
	Scanner sc=new Scanner(System.in);
	
	public Account() {
		
	}
	public Account(int accNo,String Name) {
		this.accNo=accNo;
		this.Name=Name;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double deposit() {
		System.out.println("Enter Amount for deposit:");
		setAmount(sc.nextDouble());
		balance=balance+amount;
		return balance;
	}
	public double withdraw() {
		System.out.println("Enter Amount for Withdraw:");
		setAmount(sc.nextDouble());
		balance=balance-amount;
		return balance;
	}
	
	public String toString() {
		return "Bank Name:"+bankName
				+ "\nACCNO:"+accNo+"\nName:"+Name+"\nBalance:"+balance;
	}
	
	
}
