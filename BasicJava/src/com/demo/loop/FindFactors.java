package com.demo.loop;

import java.util.Scanner;

public class FindFactors {
	
	public static void FindFactor(int num) {
		int i,count=0;
		for(i=1;i<=num;i++) {
			
			if(num%i==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("count:"+count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("Enter Number");
		num=sc.nextInt();
		
		FindFactor(num);
		
		
	}

}
