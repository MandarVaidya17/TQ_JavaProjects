package com.operators;

public class MyClass21 {
		public static void main(String[] args) {
			int a=34;
			double d=20.5;
			
			d+=a;
			a+=d;
			d-=a;
			a-=d;
			
			System.out.println("d="+ ++d);//-32.5
			System.out.println("a="+ a--);//121
		}
}
