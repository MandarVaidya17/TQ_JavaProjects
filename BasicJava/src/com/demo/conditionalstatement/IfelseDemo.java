package com.demo.conditionalstatement;

import java.util.Scanner;

public class IfelseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("Enter number:");
		num=sc.nextInt();
		
		if(num%5==0) {
			System.out.println("Hello");
		}else if(num%3==0) {
			System.out.println("Welcome");
		}else if(num%6==0) {
			System.out.println("Good Morning");
		}
	}

}
