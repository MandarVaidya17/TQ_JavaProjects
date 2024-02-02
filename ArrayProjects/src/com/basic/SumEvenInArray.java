package com.basic;

public class SumEvenInArray {
	
	static void sumEven(int ar[]) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			if((ar[i]%2)==0) {
				sum=sum+ar[i];
			}
		}
		System.out.println("sumOfEven:"+sum);
	}

	public static void main(String[] args) {
		int arr[]= {1,2,4,6,7};
		sumEven(arr);

	}

}
