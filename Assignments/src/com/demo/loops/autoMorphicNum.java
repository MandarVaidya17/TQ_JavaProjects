package com.demo.loops;

import java.util.Scanner;

public class autoMorphicNum {
	public static void armNum(int num) {
		int temp,rem;
		temp=num;
		int count=0;
		int sqr=num*num;

		while(num!=0) {
			rem=num%10;
			num=num/10;
			count++;
		}
			int fact=1;
			for(int i=1;i<=count;i++) {
				fact*=10;
			}
			
		
		if(sqr%fact==temp) {
			System.out.println("Automorphic Num");
		}else {
			System.out.println("Not Automorphic number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num=sc.nextInt();
		armNum(num);
	}
}
