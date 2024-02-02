package com.conditionaloperator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double num1,num2;
		char c;
		
		System.out.println("Enter number 1");
		num1=sc.nextDouble();
		System.out.println("Enter number 2");
		num2=sc.nextDouble();
		System.out.println("Enter Operator(+,-,*,/)");
		c=sc.next().charAt(0);
		
		if(c=='+') {
			System.out.println(num1+num2);
		}else if(c=='-') {
			System.out.println(num1-num2);
		}else if(c=='*') {
			System.out.println(num1*num2);
		}else if(c=='/') {
			System.out.println(num1/num2);
		}
	}

}
