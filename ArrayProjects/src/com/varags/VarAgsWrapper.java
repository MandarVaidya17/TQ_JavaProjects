package com.varags;

public class VarAgsWrapper {
	
	static void display( Object...ob) {
		System.out.println("in obj");
		for(Object st:ob) {
			System.out.println(st);
		}
	}
	static void display(Number ...n1) {
		System.out.println("in number");
		for(Number st:n1) {
			System.out.println(st);
		}
	}
	static void display(Double ...d1) {
		System.out.println("in double");
		for(Double st:d1) {
			System.out.println(st);
		}
	}
	static void display(Integer...i1) {
		System.out.println("in double");
		for(Integer st:i1) {
			System.out.println(st);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(3,2.5f,4.6);//Float:Number:Object
		display('a','b','c');//Character:Object
		display(2.3,4.5,6.7);
		
	}

}
