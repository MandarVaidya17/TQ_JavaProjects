package com.demo.operators;

import java.util.Scanner;

public class TernaryOperatorTest1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
				
		int n1,n2,min;
		System.out.println("Enter num1:");
		n1=sc.nextInt();
		
		System.out.println("Enter num2");
		n2=sc.nextInt();
		
		min=n1<n2? n1:n2;
		System.out.println("min:"+min);

	}

}
