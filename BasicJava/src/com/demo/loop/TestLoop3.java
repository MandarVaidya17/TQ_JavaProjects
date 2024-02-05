package com.demo.loop;

import java.util.Scanner;

public class TestLoop3 {
	public static void printNum(int start,int end) {
		int i;
		
		for(i=start;i<=end;i++) {
			System.out.println("num="+i);
		}
		
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
