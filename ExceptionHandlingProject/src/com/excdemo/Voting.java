package com.excdemo;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter your age:");
			int age=sc.nextInt();
			if(age>=18) {
				System.out.println("Vote");
			}
			else {
				System.out.println("cnanot vote");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			sc.close();
			System.out.println("finally block");
		}
		System.out.println("vote ends..");
	}
}
