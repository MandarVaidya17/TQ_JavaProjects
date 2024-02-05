package com.intermediate;

import java.util.Arrays;

public class ShiftNegativePositive {
	
	static void shiftNegative(int ar[]){
		int left=0;
		int right=ar.length-1;
		while(left<right) {
			while(ar[left]>0 && left<right) 
			left++;
			while(ar[right]<0 && left<right) 
			right++;
			if(left<right) {
				int temp=ar[left];
				ar[left]=ar[right];
				ar[right]=temp;
				left++;
				right--;
				
			}
			
		}
		
	}
	
	static void siftNegative2(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			for(int j=ar.length-1;j>=0;j--) {
				if(ar[i]<0&&i<j) {
					int temp=ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,3,-1,5,8,-4,6,-9};
		//shiftNegative(arr);
		siftNegative2(arr);
		System.out.println(Arrays.toString(arr));
	}

}
