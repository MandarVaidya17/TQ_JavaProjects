package com.inheritnce;

class Vehicle1{
	int wheels;
	String color;
	
	public Vehicle1(int wheels,String color) {
		this.wheels=wheels;
		this.color=color;
	}
	public String toString() {
		return "Color:"+color+" Wheel:"+wheels;
	}
}

class Car1 extends Vehicle1{
	int seat;
	
	public Car1(int wheels,String color,int seat) {
		super(wheels, color);
		this.seat=seat;
	}
	public String toString() {
		return super.toString()+" Seat:"+seat;
	}
	
}

public class Suv extends Car1 {
	int HP;
	 
	public Suv(int wheels,String color,int seat,int HP) {
		super(wheels, color, seat);
		this.HP=HP;
	}
	public String toString() {
		return super.toString()+" Power:"+HP+"HP";
	}

	public static void main(String[] args) {
			Suv s=new Suv(4, "Red", 4, 110);
			System.out.println(s);

	}

}
