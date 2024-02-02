package com.conditionaloperator;

import java.util.Scanner;

public class DivisibleBy7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int num,num2;
		
		System.out.println("Enter number");
		num=sc.nextInt();
		
		
		if(num%7==0) {
			System.out.println("Number is divisible by 7");
			
		}else  {
			System.out.println("Add Num2 for addition");
			num2=sc.nextInt();
			num=num+num2;
			if(num%7==0) {
			System.out.println("number is divisible by 7 after adding");
			}else {
				System.out.println("Invalid number");
			}
		}
		
		
	}

}
