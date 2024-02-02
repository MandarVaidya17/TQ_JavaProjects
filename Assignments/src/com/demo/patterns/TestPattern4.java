package com.demo.patterns;

import java.util.Scanner;

public class TestPattern4 {
	
	public static void printPattern(int rows) {
		int i,j,k;
		
		
		for(i=1;i<=rows;i++) {
			k=i;
			for(j=1;j<=i;j++,k++) {
				System.out.print((char)(64+i));
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
