package com.basic;

import java.util.Arrays;

public class arrayDemo1 {
	
		static void checkArray(int ar[]) {
			for(int i=0;i<ar.length;i++) {
				if(ar[i]<0) {
					ar[i]=0;
				}
			}
			System.out.println(Arrays.toString(ar));
		}
	
		public static void main(String[] args) {
			int arr[]= {2,3,6,-1,0,-5,8,9};

			checkArray(arr);
		}
}
