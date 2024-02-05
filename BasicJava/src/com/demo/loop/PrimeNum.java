package com.demo.loop;

import java.util.Scanner;

public class PrimeNum {
	
	public static void primeNum(int num) {
		int i,count=0;
		//int n=num/2;
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter num:");
		num=sc.nextInt();
		
		primeNum(num);
		
	}

}
