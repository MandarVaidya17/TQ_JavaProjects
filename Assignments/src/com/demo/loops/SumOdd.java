package com.demo.loops;

import java.util.Scanner;

public class SumOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,n,sum=0;
		System.out.println("enter num");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println("sum "+sum);
	}

}
