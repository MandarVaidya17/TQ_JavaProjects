package com.operators;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle..");
		float r=sc.nextFloat();
		float pi=3.14f;
		float area=pi*r*r;
		System.out.println("Area of circle is.."+area);

	}

}
