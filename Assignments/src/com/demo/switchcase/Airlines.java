package com.demo.switchcase;

import java.util.Date;
import java.util.Scanner;

public class Airlines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name,bplace,destination;
		int amount,choice,coupon;
		Date d=new Date();
		
		System.out.println("Welcome to Airlines");
		System.out.println("Please Enter Your Name");
		name=sc.next();
		
		System.out.println("Select choice of Airlines");
		System.out.println("1.Air India\n2.Luftansa\n3.Indigo");
		
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Please Enter your bording place");
			bplace=sc.next();
			System.out.println("Please Enter your destination");
			destination=sc.next();
			amount=20000;
			System.out.println("Your amount is 20000");
			System.out.println("Do you have any coupon.\n1.Yes\n2.No");
			coupon=sc.nextInt();
			if(coupon==1) {
				System.out.println("You have 25% Discount on your amount");
				amount=(int) (amount-amount*0.25);
				System.out.println("Your Total Amount after Discount is "+amount);
			}else {
				System.out.println("Your Total Amount is "+amount);
				}
			
			
			System.out.println(name+" Your Ticket is booked form "+bplace+" to "+destination+ "on this date "+d);
			System.out.println("Thank You For Travaling with Air India,Enjoy The Flight");
			break;
			
		case 2:
			System.out.println("Please Enter your bording place");
			bplace=sc.next();
			System.out.println("Please Enter your destination");
			destination=sc.next();
			amount=21000;
			System.out.println("Your amount is 21000");
			System.out.println("Do you have any coupon.\n1.Yes\n2.No");
			coupon=sc.nextInt();
			if(coupon==1) {
				System.out.println("You have 23% Discount on your amount");
				amount=(int) (amount-amount*0.23);
				System.out.println("Your Total Amount after Discount is "+amount);
			}else {
			System.out.println("Your Total Amount is "+amount);
			}
			System.out.println(name+" Your Ticket is booked form "+bplace+" to "+destination+ "on this date "+d);
			System.out.println("Thank You For Travaling with Luftansa,Enjoy The Flight..");
			break;

		case 3:
			System.out.println("Please Enter your bording place");
			bplace=sc.next();
			System.out.println("Please Enter your destination");
			destination=sc.next();
			amount=18000;
			System.out.println("Your amount is 18000");
			System.out.println("Do you have any coupon.\n1.Yes\n2.No");
			coupon=sc.nextInt();
			if(coupon==1) {
				System.out.println("You have 17% Discount on your amount");
				amount=(int) (amount-amount*0.17);
				System.out.println("Your Total Amount after Discount is "+amount);
			}else {
				System.out.println("Your Total Amount is "+amount);
				}
			
			System.out.println(name+" Your Ticket is booked form "+bplace+" to "+destination+ "on this date "+d);
			System.out.println("Thank You For Travaling with Indigo,Enjoy The Flight");
			break;
			default:
				System.out.println("Invalid Choice For Airlines");
		}
	}

}
