package com.demo.methoddemo;

import java.util.Scanner;

public class MethodTest2 {
	
	public static void display(String name){
		System.out.println("Name:"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("Enter Name");
		name=sc.next();
		display(name);
		
	}

}
