package com.mearg;
//Write a program to reverse an array in following manner.
//Suppose array size is even then later half should come first and first half 
//should go last. E.g. input array { 1,2,5,7,3,4} output will be { 7,3,4, 1,2,5}. 
//If array size is even then middle element should remain as it is and array will be
// reversed as above. E.g. input array { 5,22,55,21,4,54,10} output will be {4,54,10,21,5,22,55}

import java.util.Arrays;

public class MergeDemo2 {
	
	static void reverseArray(int ar[]) {
		int index=0;
		int arr[]=new int[6];
		for(int i= ar.length/2;i<ar.length;i++) {
			arr[index++]=ar[i];
		}
			for(int j=0;j<ar.length/2;j++) {
				arr[index++]=ar[j];
			}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	static void reverseArr1(int ar[]) {
		int mid=ar[ar.length/2];
		int index=0;
		int arr[]=new int[ar.length];
		for(int i= ar.length/2;i<ar.length;i++) {
			
			arr[index++]=ar[i];
		}
			for(int j=0;j<ar.length/2;j++) {
				if(mid%2!=0) {
					arr[mid]=ar[mid];
				}
				arr[index++]=ar[j];
			}
			System.out.println(Arrays.toString(arr));
	}
		public static void main(String[] args) {
			int arr[]={ 1,2,5,7,3,4};
			int arr1[]={ 5,22,55,21,4,54,10};
			reverseArray(arr);
			reverseArr1(arr1);
			
			//System.out.println(Arrays.toString(arr));
		}
}
