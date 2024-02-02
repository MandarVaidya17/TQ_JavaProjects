package com.conditionaloperator;

import java.util.Scanner;

public class MaximumIn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		System.out.println("Enter c");
		c=sc.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println("a is maximum number");
		}else if(b>=a && b>=c) {
			System.out.println("b is maximum number");
		}else if(c>=a && c>=b ) {
			System.out.println("c is maximum number");
		}
			
		
	}

}
