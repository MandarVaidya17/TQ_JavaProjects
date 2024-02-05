package com.interfacedemo;
//Create an example to show the usage of default, static and private method in interface

interface InterDemo{
	void  print();
	
	default void show() {
		System.out.println("In Default Method.");
		display();
	}
	static void demoShow() {
		System.out.println("In Interface static method");
	}
	private void display() {
		System.out.println("In Private method");
	}
	static double getId() {
		return 911;
	}
	
}

class Demo1 implements InterDemo{

	@Override
	public void print() {
		System.out.println("In class Demo1");
	}
}

class Demo2 implements InterDemo{

	@Override
	public void print() {
		System.out.println("In class Demo2");
	}
	public void show() {
		System.out.println("In demo2 show method");
	}

	
}
public class InterfaceDemo2 {
	public static void main(String[] args) {
		InterDemo.demoShow();//static method
		System.out.println(InterDemo.getId());//static return type
		InterDemo a1;
		a1=new Demo1();
		a1.print();//override method
		a1.show();//static method from interface.
		
		a1=new Demo2();
		a1.print();
		a1.show();
		

	}

}
