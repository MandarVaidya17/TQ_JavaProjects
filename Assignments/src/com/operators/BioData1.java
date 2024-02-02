package com.operators;

import java.util.Scanner;

public class BioData1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.next();
		
		System.out.println("Enter age:");
		int age = sc.nextInt();
		
		System.out.println("Enter height");
		 float height =sc.nextFloat();
		 
		 System.out.println("enter weight:");
		 double weight= sc.nextDouble();
		 
		 System.out.println("enter Contact");
		 long contact=sc.nextLong();
		 
		 System.out.println("Enter boolean:");
		 boolean a=sc.nextBoolean();
		 
		 System.out.println("enter byte");
		 byte b=sc.nextByte();
		 
		 System.out.println("enter short");
		 short s=sc.nextShort();
		 
		 System.out.println("Name:"+name);
		 System.out.println("Age:"+age);
		 System.out.println("Height"+height);
		 System.out.println("Weight"+weight);
		 System.out.println("Contact:"+contact);
		 System.out.println("byte:"+b);
		 System.out.println("short:"+s);
		 System.out.println("boolean:"+a);
		 
	}

}
