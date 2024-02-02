package com.intermediate;

import java.util.Arrays;

public class ShiftZeroBeginning {
	static void shiftzero(int ar[])
	{
		int count=ar.length-1;
		int j=0;
		int temp[]=new int[ar.length];
//		for(int i=count;i>=0;i--) {
//			if(ar[i]!=0) {
//				ar[count]=ar[i];
//				count--;
//			}
//		}
//		while(count>=0) {
//			ar[count--]=0;
//		}
		for(int i=0;i<ar.length;i++)
		{
			 if(ar[i]==0)
			 {
				 temp[j]=ar[i];
				 j++;
				 
			 }
			 
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("arr[i]"+ar[i]);
			System.out.println("j"+j);
			 if(ar[i]!=0)
			 {
				 temp[j]=ar[i];
				 j++;
				 
			 }
		}
		System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,0,6,-7,0,4,0,5,6,2};
		System.out.println(Arrays.toString(arr));
		shiftzero(arr);
	
		
	}

}
