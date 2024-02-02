package com.basic;

public class MinMaxArr {
	
	static void maxArr(int ar[]) {
		int max=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(max<ar[i])
				max=ar[i];
		}
		System.out.println("Max no:"+max);
	}
	static void minArr(int ar[]) {
		int min=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(min>ar[i])
				min=ar[i];
		}
		System.out.println("Min no:"+min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {12,34,54,6,37,89,3,90};
			maxArr(arr);
			minArr(arr);
	}

}
