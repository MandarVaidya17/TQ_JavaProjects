package com.intermediate;

public class SumPairArray {
	static void checkPair(int ar[]) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				sum=ar[i]+ar[j];
				if(sum==8) {
					System.out.println(ar[i]+" "+ar[j]);
				}
			}	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {2,3,5,4,6,0,8};
			checkPair(arr);
	}

}
