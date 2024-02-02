package com.basic;

public class SumOddInArray {
	
	static void OddSum(int ar[]) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2!=0) {
				sum=sum+ar[i];
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,9,11,34,5};
		
		OddSum(arr);

	}

}
