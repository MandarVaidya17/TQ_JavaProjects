package com.demo.methoddemo;

import java.util.Scanner;

public class SquareCube {
	
	public static int findsqur(int num) {
		return num*num;
	}
	
	public static int findcube(int num) {
		return num*num*num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num ");
		int num=sc.nextInt();
		
		int ans=findsqur(num);
		int ans1=findcube(num);
		System.out.println("Square "+ans);
		System.out.println("cube "+ans1);
	}

}
