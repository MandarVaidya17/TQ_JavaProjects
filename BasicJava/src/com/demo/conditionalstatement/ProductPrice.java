package com.demo.conditionalstatement;

import java.util.Scanner;

public class ProductPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int quentity,price;
		
		System.out.println("Enter quentity");
		quentity=sc.nextInt();
		if(quentity>=0) {
			
			if(quentity>=50) {
				price=quentity*100;
				System.out.println("Total bill is "+price);
			}else if(quentity<50 && quentity>=30) {
				price=quentity*125;
			}else if(quentity<=30) {
						price=quentity*140;
						System.out.println("total bill is "+price);
			}
	
	}
		else {
			System.out.println("Please enter postivide numberS");
		}
}
}




