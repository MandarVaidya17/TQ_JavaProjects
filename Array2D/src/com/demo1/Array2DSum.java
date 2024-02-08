package com.demo1;

import java.util.Scanner;

public class Array2DSum {
	
//	static void sumRowArray(int ar[][]) {
//			}
//	//static void sumRowArray(int arr[][])
	static void displayMultiarray(int ar[][]) {
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter rows");
		int rows=sc.nextInt();
		System.out.println("enter cols");
		int cols=sc.nextInt();
		
		int arr[][]=new int[rows][cols];
		
		System.out.println("----------------------");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter values of row"+(i+1)+" ");
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		displayMultiarray(arr);
		
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			
			}
			System.out.println(sum);
		}

		 

	}

}
