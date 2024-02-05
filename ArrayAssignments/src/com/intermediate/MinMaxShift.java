package com.intermediate;

import java.util.Arrays;

//Find the max and minimum number from an array and swap their positions
//eg:{1,2,3,4,5,6}
//o/p:{6,2,3,4,5,1}
public class MinMaxShift {
	
		
	
		static void minMaxShift(int ar[]) {
				int min=Integer.MAX_VALUE;
				int max=Integer.MIN_VALUE;
				int posMin=0,posMax=0;
				int i,j;
				for(i=0;i<ar.length;i++) {
					if(min>ar[i]) {
						min=ar[i];
						posMin=i;
					}
					if(max<ar[i]) {
						max=ar[i];
						posMax=i;
					}
					
				}
				int temp=ar[posMin];
				ar[posMin]=ar[posMax];
				ar[posMax]=temp;
				System.out.println(Arrays.toString(ar));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {2,3,4,8,9,7,11,14,6};
			System.out.println(Arrays.toString(arr));
			minMaxShift(arr);
			
			
	}

}
