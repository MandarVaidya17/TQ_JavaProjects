package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class CubeArray {
	
	static void cubeArr(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			ar[i]=ar[i]*ar[i]*ar[i];
		}
		System.out.println(Arrays.toString(ar));
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
			//int arr[]= {2,3,5,9,6,4};
			cubeArr(arr);
	}

}
