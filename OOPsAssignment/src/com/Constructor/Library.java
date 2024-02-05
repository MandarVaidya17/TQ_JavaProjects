package com.Constructor;

import java.util.Scanner;

//Create a library of books , Count the number of books added in the library. All the books have a common supplier "Mr XYZ" 
//Show the details of library as:
//Supplier name:
//Total books:
//Book detail

public class Library {
	
	static int count=0;
	static String supplierName="MR.XYZ";
	static Scanner sc=new Scanner(System.in);
	
	public static void getDetails(Book b) {
		System.out.println("Enter Id:");
		b.setId(sc.nextInt());
		System.out.println("Enter Book Name");
		b.setName(sc.next());
		count++;
	}

	public static void main(String[] args) {
		Book b1=new Book();
		getDetails(b1);
		Book b2=new Book();
		getDetails(b2);
		Book b3=new Book();
		getDetails(b3);
		System.out.println("Supplier Name:"+supplierName);
		System.out.println("Total Books:"+count);
		System.out.println("Details:"+b1.getName());
		System.out.println("Details:"+b2.getName());
		System.out.println("Details:"+b3.getName());
		
	}

}
