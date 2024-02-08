package com.varags;

public class VaragsOverloading {
	
	static void display(int ...a1) {
		System.out.println("in int");
	for(int x:a1) {
		System.out.println(x);
	}
	}
	
	static void display(double ...d1) {
		System.out.println("in double");
		for(double x:d1) {
			System.out.println(x);
		}
	}
	static void displayme(int x,char ...ch) {
		System.out.println(x);
		for(char c:ch) {
			System.out.println(c);
		}
	}
	static void displayme(char c,int ...a) {
		System.out.println(c);
		for(int x:a) {
			System.out.println(x);
		}
	}
	
	static void show(Integer ...a1) {
		System.out.println("in wrapper int");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		display(2,3,4,5);
		System.out.println("----------------------");
		display(2.5,3.6,4,5);
		System.out.println("----------------------");
		
		displayme(21,'a','b');
		//displayme('a','v','c');
		
		show(23,44,55);
		

	}

}
