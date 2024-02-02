package com.basic;

import java.util.Arrays;

public class PassingArray {
	static void sqareElement(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			ar[i]=ar[i]*ar[i];
		}
		System.out.println("Inside arr");
		System.out.println(Arrays.toString(ar));
	}
	int sumOfElemnt(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
			return sum;

	}

	public static void main(String[] args) {
		int arr[]= {2,5,7,45,87,12};
		int a[]= {1,3,4,60,20};
		System.out.println(Arrays.toString(arr));
		sqareElement(arr);
		
		PassingArray p1=new PassingArray();
		//p1.sumOfElemnt(arr);
		System.out.println(p1.sumOfElemnt(a));
		
		System.out.println(p1.sumOfElemnt(new int[] {1,3,5}));
		
		
	}

}
