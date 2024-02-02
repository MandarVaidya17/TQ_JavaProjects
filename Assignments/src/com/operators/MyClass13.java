package com.operators;

public class MyClass13 {
		public static void main(String[] args) {
			int i= 4;
			int j=21;
			
			int k = ++i * 7 + 2 - j--;
			System.out.println("k="+k);//16
		}
}
