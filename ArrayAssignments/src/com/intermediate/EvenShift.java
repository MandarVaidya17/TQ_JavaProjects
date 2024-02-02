package com.intermediate;

import java.util.Arrays;

public class EvenShift {
	static void shifteven(int ar[]) {
		int i;
		int count=0;
		for(i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				ar[count]=ar[i];
				count++;
			}
		}
		for(i=0;i<ar.length;i++) {
			if(ar[i]%2!=0) {
				ar[count]=ar[i];
				count++;
			}
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {2,4,5,6,7,9,12};
			shifteven(arr);
			System.out.println(Arrays.toString(arr));
	}

}
