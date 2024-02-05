package com.demo.conditionalstatement;

import java.util.Scanner;

public class NegativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num;
		
		System.out.println("Enter the Number");
		num=sc.nextInt();
		
		if(num>=0) {
			System.out.println(num+" is Positive");
		}
		else if(num==0) {
			System.out.println("zero is neither a negative or a positive number ");
		}
		else {
			System.out.println(num+" is Negative");
		}
		
	}

}
