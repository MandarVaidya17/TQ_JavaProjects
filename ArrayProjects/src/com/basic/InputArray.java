package com.basic;

import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter size");
			int size=sc.nextInt();
			int arr[]=new int[size];
			
			System.out.println("enter element");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("----------------");
			
			for(int i=0;i<arr.length;i++) {
				if((arr[i]%2)==0) {
					System.out.println("Even No:"+arr[i]);
				}
			}
			sc.close();
	}

}
