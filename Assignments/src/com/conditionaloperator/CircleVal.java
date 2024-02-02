package com.conditionaloperator;

import java.util.Scanner;

public class CircleVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cv = π * r^2 * h
		
		Scanner sc=new Scanner(System.in);
		int r,h;
		float cirval,pi=3.14f;
		
		System.out.println("Enter Radius");
		r=sc.nextInt();
		System.out.println("Enetr Height");
		h=sc.nextInt();
		
		cirval=pi*r*r*h;
		
		System.out.println(cirval);
		
	}

}
