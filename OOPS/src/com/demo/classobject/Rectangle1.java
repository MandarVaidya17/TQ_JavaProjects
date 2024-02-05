package com.demo.classobject;

public class Rectangle1 {
	
	double lenght;
	double breadth;
	
	public void setdata(double len,double br) {
		lenght=len;
		breadth=br;
	}
	
	public void displayData() {
		System.out.println("Length:"+lenght);
		System.out.println("Breadth:"+breadth);
	}
	
	public double CalArea() {
		return lenght*breadth;
	}
	
	public double CalPerimeter() {
		return 2*(lenght+breadth);
	}

}
