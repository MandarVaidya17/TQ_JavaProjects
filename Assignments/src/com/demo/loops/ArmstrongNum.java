package com.demo.loops;

import java.util.Scanner;

public class ArmstrongNum {
	public static void armNum(int num) {
		int sum = 0,temp,rem;
		temp=num;
		
		while(temp>0) {
			rem=temp%10;
			sum=sum+rem*rem*rem;
			temp=temp/10;
		}
		
		if(sum==num) {
			System.out.println("Armstrong Num");
		}else {
			System.out.println("Not Armstrong number");
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
