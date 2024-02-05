package com.demo.switchcase;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("------Welcome to myCafe------");
		System.out.println("1.Tea\n2.Coffe\n3.Cold Drink");
		System.out.println("Enter Choice");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Tea Rs 30");
			break;
		case 2:
			System.out.println("Coffee Rs 100");
			break;
		case 3:
			System.out.println("cold drink Rs 50");
			break;
			default:
				System.out.println("Invalid Choice");
		}
	}

}
