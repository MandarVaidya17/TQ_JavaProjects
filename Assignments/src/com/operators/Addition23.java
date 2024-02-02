package com.operators;

public class Addition23 {
		public static void main(String[] args) {
			int a=4;
			a-=10;
			a=-a;
			a=7+a;
			System.out.println("a="+a);//13
			a%=a;
			a=a*a-3;
			System.out.println("a="+a);//-3
		}
}
