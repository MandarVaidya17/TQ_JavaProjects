package com.demo.loop;

import java.util.Scanner;

public class TestLoop2 {
		
	public static void printNum(int range) {
		int i;
		
		for(i=0;i<=range;i++) {
			System.out.println("i="+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int n=sc.nextInt();
		
		printNum(n);
		
		
	}

}
