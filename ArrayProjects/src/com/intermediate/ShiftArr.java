package com.intermediate;

import java.util.Arrays;

public class ShiftArr {
	
	static void shiftArr(int ar[]) {
		int half = ar.length / 2;
        for (int i = 1; i < half;i++) {
        	for(int j=i+1;j<half;j++) {
        		if(ar[i]>ar[j]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
        	}
        }
        }
        for (int i=half+1;i<ar.length-1;i++) {
        	for(int j=i+1;j<ar.length-1;j++) {
        		if(ar[i]<ar[j]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
        	}
        }
        }
			System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int arr[]= {2,5,9,6,4,8,0,3,1};
		shiftArr(arr);
		int ar[]= new int[10];
		System.out.println(ar[0]);
		
		
	}
}
