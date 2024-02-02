package com.demo.loops;

import java.util.Scanner;

public class DisarumNum {
	
	public static void printDis(int num) {
		int rem=0,count=0;
		int temp=num;
		int temp1=num;
		int sum=0;
		
		while(num!=0) {
			rem=num%10;
			num=num/10;
			count++;
		}
		System.out.println(count);
		while(temp>0) {
			int fact=1;
			rem=temp%10;
			for(int i=1;i<=count;i++) {
				fact*=rem;
			}
			
			sum=sum+fact;
			count--;
			temp=temp/10;
		    
		}
		if(sum==temp1) {
			System.out.println("Disarum Num");
		}else {
			System.out.println("not disarum");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Num");
		n=sc.nextInt();
		printDis(n);
	}

}
