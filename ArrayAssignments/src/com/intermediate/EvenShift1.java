package com.intermediate;
//Shift all the even number at the end of array using temporary array 
import java.util.Arrays;

public class EvenShift1 {
	static void evenShift(int ar[]) {
		int tmp[]=new int[ar.length];

		for(int i=0;i<ar.length;i++)
	    {
	      for(int j=ar.length-1;j>=0;j--)
	      {
	        if(ar[i]%2==0&& i<j)
	        {
	          int temp=ar[j];
	          ar[j]=ar[i];
	          ar[i]=temp;
	          tmp=ar;
	        }
	      }
	    }
		System.out.println(Arrays.toString(tmp));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,5,6,67,23,22,7,9,12};
		System.out.println(Arrays.toString(arr));
		evenShift(arr);
		
	}

}
