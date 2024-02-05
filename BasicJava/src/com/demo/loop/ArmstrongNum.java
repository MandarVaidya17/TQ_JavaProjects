package com.demo.loop;

import java.util.Scanner;

public class ArmstrongNum {
	
	public static int countDigit(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		return count;
	}
	
	public static int power(int base,int pow) {
		int i;
		int p=1;
		for(i=1;i<=pow;i++) {
			p*=base;
		}
		return p;
	}
	
	public static boolean testArmstrong(int num) {
		int pow=countDigit(num);
		int original=num;
		int rem,sum=0;
		while(num!=0) {
			rem=num%10;
			sum=sum+power(rem, pow);
			num/=10;
		}
		return original==sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter num:");
		n=sc.nextInt();
		
		boolean status=testArmstrong(n);
		if(status) {
			System.out.println("Armstrong num");
		}else {
			System.out.println("not armstrong");
		}
	}

}
