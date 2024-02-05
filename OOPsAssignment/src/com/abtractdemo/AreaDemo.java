package com.abtractdemo;
//Write a Java program to create an abstract class Shape with abstract methods calculateArea()
//and calculatePerimeter(). 
//Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods 
//to calculate the area and perimeter of each shape.

abstract class Shape{
	 double area;
	 double perimeter;
	abstract void calculateArea();
	abstract void calculatePerimeter();
}

class Circle extends Shape{
	double radius;
	
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius=radius;
	}

	@Override
	void calculateArea() {
		area=3.14*radius*radius;
		System.out.println("Area of Circle is:"+area);
	}

	@Override
	void calculatePerimeter() {
		
		perimeter=2*3.14*radius;
		System.out.println("Perimeter of Circle is:"+perimeter);
	}
	
}

class Triangle extends Shape{
	int height,base;
	
	public Triangle(int height,int base) {
		this.height=height;
		this.base=base;
	}

	@Override
	void calculateArea() {
		area=0.5*(height*base);
		System.out.println("Area of Rectangle is:"+area);
	}

	@Override
	void calculatePerimeter() {
		perimeter=(height*base)*2;
		System.out.println("Perimeter of Rectangle is:"+perimeter);
	}
	
}
public class AreaDemo {

	public static void main(String[] args) {
		Shape s;
		s=new Circle(6);
		s.calculateArea();
		s.calculatePerimeter();
		s=new Triangle(10, 5);
		s.calculateArea();
		s.calculatePerimeter();
	}

}
