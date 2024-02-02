package com.conditionaloperator;

import java.util.Scanner;

public class CheckChar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the char Value..");
		char c=sc.next().charAt(0);
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
			System.out.println("character is alphabte");
		}
		else if((c>='0' && c<='9')){
			System.out.println("character is number");
		}
		else {
			System.out.println("Character is special character");
		}

	}

}
