package com.basic;

import java.util.Scanner;

public class maximumArrNum {
	
	static void maxNum(int ar[]) {
		int max=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(max<ar[i]) {
				max=ar[i];
			}
		}
		System.out.println("Max:"+max);
	}
	
	static void minNum(int ar[]) {
		int min=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(min>ar[i]) {
				min=ar[i];
			}
		}
		System.out.println("min:"+min);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("enter element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
			//int arr[]= {1,3,5,6,8,91};
			maxNum(arr);
			minNum(arr);
			sc.close();
	}

}
