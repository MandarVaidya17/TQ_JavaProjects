package com.demo.classobject;

import java.util.Scanner;

public class TestRectangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length:");
		double len=sc.nextDouble();
		System.out.println("Enter Breadth:");
		double br=sc.nextDouble();
		Rectangle1 r1=new Rectangle1();
		r1.setdata(len, br);
		r1.displayData();
		System.out.println("Area:"+r1.CalArea());
		System.out.println("Perimeter:"+r1.CalPerimeter());
		
	}

}
