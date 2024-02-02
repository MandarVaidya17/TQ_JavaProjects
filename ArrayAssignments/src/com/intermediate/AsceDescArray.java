package com.intermediate;

import java.util.Arrays;

public class AsceDescArray {
	
	static void aseDesArr(int ar[]) {
		int half = ar.length / 2;
        for (int i = 0; i < half;i++) {
        	for(int j=i+1;j<half;j++) {
        		if(ar[i]>ar[j]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
        	}
        }
        }
        for (int i=half;i<ar.length;i++) {
        	for(int j=i+1;j<ar.length;j++) {
        		if(ar[i]<ar[j]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
        	}
        }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {2,4,1,6,9,5};
			aseDesArr(arr);
			System.out.println(Arrays.toString(arr));
	}

}
