package com.demo.patterns;

import java.util.Scanner;

public class testPattern1 {

	public static void printPattern(int rows) {
		int i,j;
		
		
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rows;
		System.out.println("Enter rows:");
		rows=sc.nextInt();
		printPattern(rows);
	}

}
