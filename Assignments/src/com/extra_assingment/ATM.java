package com.extra_assingment;

import java.util.Scanner;

public class ATM {
	static Scanner sc=new Scanner(System.in);
	static int pass=9988,balance=1000;
	static int amount,choice,pin;
	static char ch;
	
	public static void withdraw() {
		int n500=0,n200=0,n100=0,n50=0,n20=0,n10=0;
		System.out.println("Enter Amount:");
		amount=sc.nextInt();
		if(amount>balance) {
			System.out.println("Your Bank Balance is Low!... check Balance ");
		}else {
			System.out.println("Amount withdraw succesfully.");
			balance=balance-amount;
			//System.out.println("Account Balance is "+balance);
			if(amount>=500) {
				n500=amount/500;
				amount=amount%500;
				System.out.println(n500+" Note RS 500 ");
			}
			if(amount>=200){
				n200=amount/200;
				amount=amount%200;
				System.out.println(n200+" Note RS 200 ");
			}
			if(amount>=100) {
				n100=amount/100;
				amount%=100;
				System.out.println(n100+" Notes RS 100 ");
			}
			if(amount>=50) {
				n50=amount/50;
				amount=amount%50;
				System.out.println(n50+" Note RS 50 ");
			}
			if(amount>=20) {
				n20=amount/20;
				amount=amount%20;
				System.out.println(n20+" Note RS 20 ");
			}
			if(amount>=10) {
				n10=amount/10;
				amount=amount%10;
				System.out.println(n10+" Note RS 10 ");
			}
		}
	}
	
	public static void credited() {
		System.out.println("Enter Amount:");
		amount=sc.nextInt();
			balance=balance+amount;
			System.out.println("Amount creadited to the account succesfully!");
	}
	
	public static void balance() {	
			System.out.println("Account Balance is "+balance);	
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter pin:");
		pin=sc.nextInt();
		int count=0;
		if(pin==pass) {
			System.out.println("Hello Pablo..");
			System.out.println("-----Welcome to ICICI ATM-----");
		do {
		System.out.println("Enter Choice:");
		System.out.println("1.Withdraw\n2.Creadit\n3.Balance\n4.Exit");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			withdraw();
			break;
		case 2:
			credited();
			break;
		case 3:
			balance();
			break;	
		}
		System.out.println("Do you want to continue?? if yes enter y...if no enter n");
		ch=sc.next().charAt(0);
		}while(ch=='y');
		System.out.println("Exit Sucessfully!");
	}else {
		System.out.println("Invalid Pin");
	}

}
}
