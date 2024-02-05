package com.demo.conditionalstatement;

import java.util.Scanner;

public class Nested_if_else1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("Enter number");
		num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Number is even");
			if(num%6==0) {
				System.out.println("Even Number is divisible by 6");
			}else {
				System.out.println("not divisible by 6");
			}
		}else { 
			System.out.println("Number is odd");
			if(num%5==0) {
					
					System.out.println("Odd Number is divisible by 5");
				}else {
					System.out.println("Number is not divisible by 5");
				}
		}
	
		
	}

}
