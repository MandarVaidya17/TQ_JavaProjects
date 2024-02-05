package com.Constructor;

import java.util.Scanner;

public class AccountBank {
	static Scanner sc=new Scanner(System.in);
	static int count=0;
	public static void insert(Account a) {
		System.out.println("Enter Acc Num:");
		a.setAccNo(sc.nextInt());
		System.out.println("Enter Name:");
		a.setName(sc.next());
		count++;
	}
	public static void display(Account a) {
		insert(a);
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account();
		Account a2=new Account();
		Account a3=new Account();
		//AccountBank b=new AccountBank();
		
		
		display(a1);
		display(a2);
		display(a3); 
		
		System.out.println("Total Account:"+count);
		
	}

}
