package com.demo.loops;

import java.util.Scanner;

public class HarshadNum {
	public static void printNum(int num) {
		int i,sum=0,rem,div;
		int temp=num;
		while(num>0) {
			 rem = num%10;  
			 sum = sum + rem;  
			 num = num/10;  
		}
		//div=num%sum;
		if(temp%sum==0) {
			System.out.println("Harshad Num");
		}else {
			System.out.println("Not harshad num");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Num:");
		n=sc.nextInt();
		printNum(n);
	}

}
