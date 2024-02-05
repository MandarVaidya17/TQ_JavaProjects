package com.Constructor;

import java.util.Scanner;

public class BookTest {
	static Scanner sc=new Scanner(System.in);
	
	public static void getDetails(Book b) {
		System.out.println("Enter Id:");
		b.setId(sc.nextInt());
		System.out.println("Enter Book Name");
		b.setName(sc.next());
		System.out.println("Enter Price:");
		b.setPrice(sc.nextInt());
		System.out.println("Enter Discount:");
		b.setDiscount(sc.nextDouble());
		
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		Book b1=new Book();
		getDetails(b1);
		Book b2=new Book();
		getDetails(b2);
		b1.compareDiscCost(b2);
		
	}

}
