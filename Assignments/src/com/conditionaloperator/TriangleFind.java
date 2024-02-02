package com.conditionaloperator;

import java.util.Scanner;

public class TriangleFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,y,z;
		
		System.out.println("Enter Sides of triangle X Y Z");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		if(x==y || y==z || z==x) {
			System.out.println("isosceles Triangle");
		}else if(x==y && y==z) {
			System.out.println("Equilateral Triangle");
		}else {
			System.out.println("Scalene Triangle");
		}
	}
	
}
