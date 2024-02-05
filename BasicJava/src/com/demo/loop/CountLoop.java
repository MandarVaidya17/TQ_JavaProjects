package com.demo.loop;

import java.util.Scanner;

public class CountLoop {
	
	public static void printNum(int start,int end) {
		int i,count=0;
		
		for(i=start;i<=end;i++) {
			System.out.println("num="+i);
			count++;
		}
		System.out.println("count:"+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int start,end;
		System.out.println("Enter start number");
		start=sc.nextInt();
		System.out.println("Enter end number");
		end=sc.nextInt();
		
		printNum(start, end);
	}

}
