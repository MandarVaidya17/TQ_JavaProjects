package com.conditionaloperator;

import java.util.Scanner;

public class Equals3No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		
		System.out.println("Enter num1");
		num1=sc.nextInt();
		System.out.println("Enter num2");
		num2=sc.nextInt();
		System.out.println("Enter num3");
		num3=sc.nextInt();
		
		if(num1==num2 && num2==num3 && num1==num3) {
			System.out.println("Three Numbers are equals");
		}else {
			System.out.println("Numbers are not same");
		}
	}

}
