package com.intermediate;

import java.util.Arrays;

public class EvenShift {
	static void shifteven(int ar[]) {
		for(int i=0;i<ar.length;i++)
	    {
	      for(int j=ar.length-1;j>=0;j--)
	      {
	        if(ar[i]%2==0&& i<j)
	        {
	          int temp=ar[j];
	          ar[j]=ar[i];
	          ar[i]=temp;
	        }
	      }
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {2,4,5,6,67,22};
			shifteven(arr);
			System.out.println(Arrays.toString(arr));
	}

}
