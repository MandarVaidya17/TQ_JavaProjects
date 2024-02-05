package com.overloading;

class Shape{
	
	static void area(int side) {
		System.out.println("Area of square:"+side*side);
	}
	 void area(int len,int br) {
		System.out.println("Area of reactangle:"+(len*br));
	}
	float area(float r) {
		//System.out.println("Area of circle:"+(3.14*r*r));
		return (3.14f*r*r);
	}
}

public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1=new Shape();
		s1.area(6);
		s1.area(10, 5);
		System.out.println("Area:"+s1.area(5f));
		PolyDemo.main(90);
	}
	
	public static void main(int data) {
		System.out.println("overload main");
		System.out.println("Data:"+data);
	}

}
