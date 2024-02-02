package com.demo.switchcase;

import java.util.Scanner;

public class NestedSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		String Vegitables,color;
		
		System.out.println("Enter Vegitables\n1.capcicum\n2.Potato");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter color of capcicum you want");
			color=sc.next();
			switch(color) {
			case "Red":
				System.out.println("red capcicum");
				break;
			case "Green":
				System.out.println("green capcicum");
				break;
			case "Yellow":
				System.out.println("yellow capcicum");
				break;
			}
			break;
		case 1+1:
			System.out.println("Potato");
			break;
		}
	}

}
