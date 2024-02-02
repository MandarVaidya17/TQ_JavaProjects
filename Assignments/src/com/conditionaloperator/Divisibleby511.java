package com.conditionaloperator;

import java.util.Scanner;

public class Divisibleby511 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.println("Enter th number:");
		num=sc.nextInt();
		
		if((num%5==0) ||(num%11==0)) {
			System.out.println(num+" is divisible by 5 & 11");
		}else {
			System.out.println("Number is not divisible by 5 & 11");
		}
	}

}
