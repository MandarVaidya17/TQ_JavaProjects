package com.basic;

public class RainAvg {
	static void avgArr(int ar[]) {
		int days=7;
		int sum=0,avg;
		for(int i=0;i<days;i++) {
			sum=sum+ar[i];
		}
		avg=sum/days;
		System.out.println("avg:"+avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,45,78,55,23,90,79};
		avgArr(arr);
	}

}
