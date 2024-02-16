package com.demo2;

import java.util.Scanner;

public class ThrowDemo2 {
	static void ageCheck() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		try {
		if(age<0) {
			throw new RuntimeException("Invalid age");
		}else if(age>=18) {
			System.out.println("Vote");
		}
		else {
			System.out.println("cnanot vote");
		}
		}
		catch (Exception e) {
			//System.out.println(e);
			System.out.println("in catch");
			throw e;
		}
		
	}
	public static void main(String[] args) {
		try {
		ageCheck();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
