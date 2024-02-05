package com.demo.loop;

import java.util.Scanner;

public class PalindromeDemo {
	
	public static boolean palNum(int num) {
		int i,temp,rem,sum = 0;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		
		if(temp==sum) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Num");
		n=sc.nextInt();
		palNum(n);
	}

}
