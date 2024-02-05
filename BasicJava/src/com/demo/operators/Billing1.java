package com.demo.operators;

import java.util.Scanner;

public class Billing1 {

	public static void main(String[] args) {
		int pro_price,que,total;
		
		pro_price=10;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter quantity..");
		que=sc.nextInt();
		total=pro_price*que;
		System.out.println("Total bill of product is.."+total);

	}

}
