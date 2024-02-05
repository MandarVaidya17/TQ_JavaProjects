package com.Constructor;

class Emp{
	int id;
	
	public Emp() {
		System.out.println("Default const parent class");
	}
	public Emp(int id) {
		this();
		this.id=id;
	}
}

public class ConstChaining  extends Emp {
	String name;
	
	public ConstChaining() {
		
	}
	public ConstChaining(int id,String name) {
		super(id);
		this.name=name;
		System.out.println("para const child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ConstChaining con=new ConstChaining(11,"Mandar");
	}

}
