package com.demo.loop;

import java.util.Scanner;

public class primeNum1 {
	
	public static void primeNum(int n) {
		
		int i,count=0;
		for(i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
				break;
			}		
		}
		if(count==0) {
			System.out.println(n+" Prime no");
		}else {
			System.out.println(n+" Not Prime no ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no");
		n=sc.nextInt();
		
		primeNum(n);
	}

}
