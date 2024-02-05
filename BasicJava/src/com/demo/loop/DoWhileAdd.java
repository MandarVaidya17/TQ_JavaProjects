package com.demo.loop;

import java.util.Scanner;

public class DoWhileAdd {
	
	public static void add(int a,int b) {
		System.out.println("Add:"+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		char ch;
		
		do {
			System.out.println("Enter num1:");
			a=sc.nextInt();
			System.out.println("Enter num2:");
			b=sc.nextInt();
			add(a, b);
			System.out.println("Do you want to continue?? if yes enter y");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("Thank You");
	}

}
