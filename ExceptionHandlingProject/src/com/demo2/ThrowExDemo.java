package com.demo2;

import java.util.Scanner;

public class ThrowExDemo {
	static void enterMarks() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		
		String name=sc.next();
		System.out.println("Enter marks");
		double marks=sc.nextDouble();
		//explicitly we throwing an exception
		//we need to creat instance of Exception
		try {
		if(marks<0 || marks>100) {
			throw new RuntimeException("Invalid marks:marks between 0 to 100");
		}else {
			if(marks>=35) {
				System.out.println(name+" has cleared exam");
			}
			else {
				System.out.println(name+" has fail");
			}
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("rest code");
	}
	public static void main(String[] args) {
		enterMarks();
	}

}
