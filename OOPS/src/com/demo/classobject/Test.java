package com.demo.classobject;

public class Test {
	
	public void method1() {
		System.out.println("this is instace method");
	}
	public void show() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test().method1();
		Test t1=new Test();
		t1.method1();
		t1.show();
	}

}
