package com.enhancedarray;

import java.util.Arrays;

public class SumOfEven {
	public static void main(String[] args) {
		int ar[]= {4,5,6,7,8,9};
		System.out.println(Arrays.toString(ar));
		int sum=0;
		for(int x:ar) {
			if(x%2==0) {
				sum=sum+x;//possible
			}
		}
		System.out.println(sum);//print sum of even no
	}

}
