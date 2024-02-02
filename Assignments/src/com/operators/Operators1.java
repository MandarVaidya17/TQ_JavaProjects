package com.operators;

public class Operators1 {
		public static void main(String[] args) {
			int a=34;
			int b=22;
			int c=a++ + ++b;
			int d=--a + --b + c--;
			int e= a+ +b + +c + d--;
			int f=-a + b-- + -c - d++;
			int sum = a+b+c+d+e+f;
			System.out.println("sum="+sum);//263
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
		}
}
