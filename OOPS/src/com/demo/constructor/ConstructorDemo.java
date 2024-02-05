package com.demo.constructor;

class Demo{
	
	private int a;
	private int b;
	private String name;
	
	Demo(){
		//this(10,20);
		a=10;
		b=20;
		name="Pablo";
		System.out.println("Default constructor");
	}
	Demo(int a,int b){
		System.out.println("Parameterizsed 1");
		this.a=a;
		this.b=b;
		name="Unkown";
	}
	Demo(int a,int b,String name){
		this.a=a;
		this.b=b;
		this.name=name;
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		
		
		}

}
