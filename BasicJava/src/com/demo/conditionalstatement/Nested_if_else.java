package com.demo.conditionalstatement;

import java.util.Scanner;

public class Nested_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age,weight;
		
		System.out.println("Enter age:");
		age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("Enter weight:");
			weight=sc.nextInt();
			
			if(weight>=50) {
				System.out.println("Your age and weight is valid for blood donation");
			}else {
				System.out.println("Your weight is not for blood donation");
			}
		}
		else {
			System.out.println("You can not donate blood as you are below 18");
		}
	}

}
