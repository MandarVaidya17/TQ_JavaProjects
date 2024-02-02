package com.basic;

import java.util.Arrays;

public class EvenOddArray {
	
	static void evenOdd(int ar[]) {
		int arr1[]=new int[ar.length];
		int arr2[]=new int[ar.length];
		int indexeven=0,indexodd=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				arr1[indexeven]=ar[i];
				indexeven++;
			}else
			{
				arr2[indexodd]=ar[i];
				indexodd++;
			}
		}
		System.out.println("Even no:"+Arrays.toString(arr1));
		System.out.println("Odd no:"+Arrays.toString(arr2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,56,77,8,99,70,33,55,22};
		evenOdd(arr);

	}

}
