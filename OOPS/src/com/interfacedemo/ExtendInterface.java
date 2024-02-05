package com.interfacedemo;

interface Movable
{
	void move();
}

interface Printable extends Movable
{
	void diplayMsg();
}


class Printer implements Printable
{

	@Override
	public void move() {
		System.out.println("laserprinter is printing at high speed");
		
	}

	@Override
	public void diplayMsg() {
		System.out.println("Printer are wife connected");
		
	}
	
}
class Car implements Movable
{

	@Override
	public void move() {
		System.out.println("car is moving at 50kmph");
		
	}
	
}
public class ExtendInterface {

	public static void main(String[] args) {
		Movable m;
		Printable p;
		m=new Printer();
		m.move();
		m=new Car();
		m.move();
		
		p=new Printer();
		p.move();
//		p=new Car();
//		p.move();
	}

}
