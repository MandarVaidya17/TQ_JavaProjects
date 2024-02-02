package com.intermediate;

import java.util.Arrays;

public class ShiftZeroEnd {
	
	static void shiftzero(int ar[])
	{
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=0) {
				ar[count]=ar[i];
				count++;
			}
		}
		while(count<ar.length) {
			ar[count++]=0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,0,6,0,-7,4,0,5,6,2};
		shiftzero(arr);
		System.out.println(Arrays.toString(arr));
	}

}
