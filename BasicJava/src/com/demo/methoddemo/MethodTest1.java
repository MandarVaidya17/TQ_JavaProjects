package com.demo.methoddemo;

public class MethodTest1 {
	
	public static void show() {
		System.out.println("Hello World");
	}
	
	public static void add(int a,int b) {
		int sum=a+b;
		System.out.println("sum:"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		
		show();
		show();
		
		add(10,20);
		add(10,'a');
		
		int x=10,y=2;
		add(x,y);
		
	}

}
