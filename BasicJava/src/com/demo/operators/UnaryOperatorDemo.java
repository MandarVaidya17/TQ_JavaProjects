package com.demo.operators;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		//case 1
		int a=10;
		a++;
		//++a;
		System.out.println(a);
		
		//case2
		int b=20;
		System.out.println(b++);
		System.out.println(b);
		
		//case3
		int c=30;
		//int d=++c;
		int d=c++;
		
		System.out.println("c:"+c);
		System.out.println("d:"+d);

	}

}
