package com.intermediate;

import java.util.Arrays;

public class SecodHigh {
	
	static int secondHighest(int ar[]) {
		int highest=Integer.MIN_VALUE;
		int shighest=Integer.MIN_VALUE;
		
		for(int x:ar) {
			if(x>highest) {
				shighest=highest;
				highest=x;
			}
			else if(x>shighest) {
				shighest=x;
			}
		}
		return shighest;
	}
		public static void main(String[] args) {
			int arr[]= {2,5,7,4,9,8,1};
			System.out.println(Arrays.toString(arr));
			int sh=secondHighest(arr);
			System.out.println(sh);
		}
}
