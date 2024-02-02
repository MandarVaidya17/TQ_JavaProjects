package com.intermediate;

import java.util.Arrays;

//WAP to replace the negative elements in an array with immendiate left elements square
public class NegativeToSquare {
	
	static void negativeSqu(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<0) {
				ar[i]=ar[i-1]*ar[i-1];
			}
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int arr[]={1,2,-3,2,-4,-6};
		System.out.println(Arrays.toString(arr));
		negativeSqu(arr);
		

	}

}
