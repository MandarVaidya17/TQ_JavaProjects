package com.memberinner;
class Outer1{
	void outerMethod() {
		System.out.println("in outer class");
	}
	class Inner{
		void msg() {
			System.out.println("IN inner method");
		}
		static void show()
		  {
			  System.out.println("In static inner method");
		  }
	}
}
public class MemberInnerDemo {
	public static void main(String[] args) {
		Outer1 o1=new Outer1();
		o1.outerMethod();
		
		Outer1.Inner i1=o1.new Inner();
		i1.msg();
		
		Outer1.Inner i2=new Outer1().new Inner();
		i2.msg();
		//i2.show();
		Outer1.Inner.show();
	}
}
