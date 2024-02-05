package com.interfacedemo;
interface Operation{
	void area();
	//default method :backward compatibility and mutable.
	default void volume(){
		System.out.println("Volume method interface");
		show();
		display();
	}
	//static method used for common properties and accesed by only interface
	static void info() {
		System.out.println("Geometry Shape:");
		display();
	}
	static double getPi() {
		return 3.147;
	}
	//private method called in default method
	private void show() {
		System.out.println("Emp name mandar");
	}
	//private static method can called in default and static method
	private static void display() {
		System.out.println("ID:983676ejkd709");
	}
}

class Square implements Operation{
	
	int side;
	public Square() {
		// TODO Auto-generated constructor stub
	}
	
	public Square(int side) {
		this.side=side;
	}
	@Override
	public void area() {
		System.out.println("Area of Square :"+(side*side));
		
	}
	
}

class Cube implements Operation{
	int side;
	public Cube() {
		// TODO Auto-generated constructor stub
	}
	public Cube(int side) {
		this.side=side;
	}
	@Override
	public void area() {
		System.out.println("Area of cube:"+(6*side*side));
		
	}
	@Override
	public void volume() {
		System.out.println("Volume of cube:"+(side*side*side));
	}
	
}
public class DefaultInterfaceDemo {

	public static void main(String[] args) {
		Operation.info();
		System.out.println("pi value:"+Operation.getPi());
		Operation o1;
		o1=new Square(5);
		o1.area();
		o1.volume();
		
	  o1=new Cube(8);
	  o1.area();
		o1.volume();

	}

}
