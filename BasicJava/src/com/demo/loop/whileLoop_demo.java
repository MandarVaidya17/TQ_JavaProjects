package com.demo.loop;

import java.util.Scanner;

public class whileLoop_demo {
	
	public static void printNum(int n) {
		int i=1;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter num");
		n=sc.nextInt();
		printNum(n);
	}

}
