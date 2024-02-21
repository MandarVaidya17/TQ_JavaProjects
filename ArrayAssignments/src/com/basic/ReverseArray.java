package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	
	static void reverseArray(int ar[]) {
		int j=ar.length-1;
		for(int i=0;i<ar.length/2;i++) {
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			j--;
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
//		System.out.println("enter size");
//		int size=sc.nextInt();
//		int arr[]=new int[size];
//		
//		System.out.println("enter element");
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
			int arr[]= {1,2,3,4,5};
			reverseArray(arr);
			
	}

}
