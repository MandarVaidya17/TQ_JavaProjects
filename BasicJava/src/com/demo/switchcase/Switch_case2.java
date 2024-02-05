package com.demo.switchcase;

import java.util.Scanner;

public class Switch_case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char choice;
		System.out.println("------Welcome to myCafe------");
		System.out.println("1.Tea\n2.Coffe\n3.Cold Drink");
		System.out.println("Enter Choice");
		choice=sc.next().charAt(0);
		
		switch(choice) {
		case 'a':
		case 'A':
			System.out.println("Tea Rs 30");
			break;
		case 'b':
		case 'B':
			System.out.println("coffee Rs 100");
			break;
		case 'c':
		case 'C':
			System.out.println("cold drink Rs 50");
			break;
		default:
			System.out.println("invalid choice");
		}
	}

}
