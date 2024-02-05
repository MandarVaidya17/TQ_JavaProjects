package com.demo.loop;

import java.util.Scanner;

public class While_sumNum {

	public static void sumNum(int n) {
		int i=1,sum=0;
		
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter Num");
		n=sc.nextInt();
		
		sumNum(n);
	}

}
