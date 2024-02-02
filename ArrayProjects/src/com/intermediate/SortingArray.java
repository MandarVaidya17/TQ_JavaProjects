package com.intermediate;

import java.util.Arrays;

public class SortingArray {
	static void sortArr(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[i]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {2,4,6,0,9,3,8,1};
		//before
		System.out.println(Arrays.toString(arr));
		sortArr(arr);
		//after
		System.out.println(Arrays.toString(arr));
	}

}
