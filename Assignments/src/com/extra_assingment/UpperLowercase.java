package com.extra_assingment;

import java.util.Scanner;

public class UpperLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		
		System.out.println("Enter Character:");
		ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z') {
			System.out.println("Character is lowercase");
		}else if(ch>='A' && ch<='Z') {
			System.out.println("Character is Uppercase");
		}
	}

}
