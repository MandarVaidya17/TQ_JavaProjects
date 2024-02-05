package com.demo.loop;

import java.util.Scanner;

public class countNumDigit {
	
	public static void countNum(int num) {
		int rem=0,count=0;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			System.out.println("rem "+rem);
			System.out.println("num"+num);
			
			count++;
		}
		System.out.println(count+" count");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countNum(152);
	}

}
