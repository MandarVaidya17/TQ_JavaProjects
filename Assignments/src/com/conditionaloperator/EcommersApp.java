package com.conditionaloperator;

import java.util.Scanner;

public class EcommersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice,options;
		System.out.println("1.Men\n2.Women\n3.Kids");
		System.out.println("Enter the choice");
		choice=sc.nextInt();
		if(choice<3) {
			
		
		if(choice==1) {
			System.out.println("Men");
			System.out.println("1.Footware\n2.TShirt");
		
		if(choice==2) {
			System.out.println("Women");
			System.out.println("1.jewellary\n2.Saree");
		
		if(choice==3) {
			System.out.println("Kids");
			System.out.println("1.Toys\n2.Educational Game");
		}
		
		}
		
		}
		
		System.out.println("Enter Options");
		options=sc.nextInt();
		
		if(choice==1) {
			if(options==1) {
				System.out.println("Footware");
			}else if(options==2) {
				System.out.println("Tshirt");
			}else {
				System.out.println("invalid");
			}
		}
		if(choice==2) {
			if(options==1) {
				System.out.println("Jwellary");
			}else if(options==2) {
				System.out.println("Saree");
			}else {
				System.out.println("invalid");
			}
		}
		if(choice==3) {
			if(options==1) {
				System.out.println("Toys");
			}else if(options==2) {
				System.out.println("Educational Game");
			}else {
				System.out.println("invalid");
			}
		}
		
		}else {
			System.out.println("Invalid Choice!");
		}
	}

}

 