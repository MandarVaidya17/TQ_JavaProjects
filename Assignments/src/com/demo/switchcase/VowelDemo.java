package com.demo.switchcase;

import java.util.Scanner;

public class VowelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		
		System.out.println("Enter Character");
		ch=sc.next().charAt(0);
		
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch+" is vovel");
			break;
		default:
				System.out.println("Chaeacter is not a vowel");
		}
	}

}
