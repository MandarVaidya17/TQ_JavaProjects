package com.staticinner;
class Outer{
	static int value=10;
	String msg="Hello";
	
	void display(){
		System.out.println("Value:"+value);
		System.out.println("Message:"+msg);
	}
	
	static class Inner
	{
		static int data=100;
		String msg1="welcome";
		
		void show() {
			System.out.println("value:"+value);
			//System.out.println(msg);
			//display();
			System.out.println("data:"+data);
			System.out.println("inner msg:"+msg1);
			
			Outer o1=new Outer();
			System.out.println("Message from outer:"+o1.msg);
			o1.display();
		}
		
		static void print() {
			System.out.println("Static inner ");
		}
	}
}
public class StaticInnerDemo {
		public static void main(String[] args) {
			Outer o1=new Outer();
			o1.display();
			Outer.Inner i1=new Outer.Inner();
			i1.show();
			
		}
}
