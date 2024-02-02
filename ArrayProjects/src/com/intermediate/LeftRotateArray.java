package com.intermediate;

import java.util.Arrays;

public class LeftRotateArray {
	static void rotateOnce(int ar[]) {
		int len=ar.length;
		int lastE=ar[0];
		
		for(int i=0;i<ar.length-1;i++) {
			ar[i]=ar[i+1];
		}
		ar[len-1]=lastE;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<2;i++) {
			rotateOnce(arr);
			System.out.println(Arrays.toString(arr));
		}
	}

}
