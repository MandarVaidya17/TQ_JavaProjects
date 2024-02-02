package com.demo.switchcase;

import java.util.Scanner;

public class AreaofShapes {
	
	static void area() {
		Scanner sc=new Scanner(System.in);
		int radius,height,base,side;
		float area = 0,circum,peri;
		String shape;
		
		System.out.println("Enter the shape.\ncircle\nrectangle\nright_angle\nsquare");
		shape=sc.next();
		
		switch(shape) {
		case "circle":
			System.out.println("enter radius");
			radius=sc.nextInt();
			area=3.14f*radius*radius;
			circum=2*radius*3.14f;
			System.out.println("Circumference of circle is "+circum);
			break;
		case "rectangle":
			System.out.println("Enter width & height of triangle");
			int w=sc.nextInt();
			int h=sc.nextInt();
			area=w*h;
			break;
		case "right_angle":
			System.out.println("Enter base & height of angle");
			base=sc.nextInt();
			height=sc.nextInt();
			area=0.5f*base*height;
			break;
		case "square":
			System.out.println("Enter side of square");
			side=sc.nextInt();
			area=side*side;
			
			peri=4*side;
			System.out.println("Perimeter of square is "+peri);
			break;
			default:
				System.out.println("invalid");
			
		}
		System.out.println("Area of "+shape+" is "+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area();
	}

}
