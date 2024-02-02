package com.basic;

public class PrimeNumArr {
	static void primeArr(int ar[]) {
		int flag=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=2;j<=ar[i]/2;j++) {
				if(ar[i]%j==0) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println("prime num:"+ar[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {11,5,3,54,7,71};
			primeArr(arr);
	}

}
