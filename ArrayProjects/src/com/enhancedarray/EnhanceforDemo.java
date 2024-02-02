package com.enhancedarray;

import java.util.Scanner;

public class EnhanceforDemo {

	public static void main(String[] args) {
		int ar[]= {4,5,6,7,8,9};
		
		for(int x:ar) {
			System.out.println(x);
		}
				
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i:arr) {
			i=sc.nextInt();//not possible
		}
		
	}

}
