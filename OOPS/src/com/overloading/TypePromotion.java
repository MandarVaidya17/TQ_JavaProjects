package com.overloading;

public class TypePromotion {
	
//	static void display(char c)
//	{
//		System.out.println("char:"+c);
//	}
//	static void display(long n) {
//		System.out.println("long"+n);
//	}
	static void display(float n) {
		System.out.println("Float:"+n);
	}
	static void display(int n,double m) {
		System.out.println("add:"+(n+m));
	}
//	static void display(long n,float m) {
//		System.out.println("ADD:"+(n+m));
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display('A');
		display(4);
		display(8,8l);
	}

}
