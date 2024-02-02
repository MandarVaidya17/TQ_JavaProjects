package com.basic;

public class SumInArray {

	public static void main(String[] args) {
		int arr[]=new int[] {6,4,3,2,11};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
			System.out.println(sum);

	}
}
