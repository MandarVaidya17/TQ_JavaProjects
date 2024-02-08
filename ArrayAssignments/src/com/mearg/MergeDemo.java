package com.mearg;

import java.util.Arrays;

//Merge the two arrays as follows
//ar1={1,2,3}
// ar2={4,5,6,7,8}
//mar1={1,4,2,5,3,6,7,8}
//mar2={1,5,3,7,8}
public class MergeDemo {
	
	static void mergeArr(int a1[],int a2[]) {
		int len1=a1.length;
		int len2=a2.length;
		int mar1[]=new int[len1+len2];
		int index=0;
		int i;
		
		for(i=0;i<len2;i++) {
			if(i<len1) {
			mar1[index++]=a1[i];
			}
			
			if(i<len2) {
				mar1[index++]=a2[i];
			}
		}
		System.out.println(Arrays.toString(mar1));
	}

	static void mergeAlter(int a1[],int a2[]) {
		int len1=a1.length;
		int len2=a2.length;
		int maxArr=Math.max(len1, len2);
		int mar2[]=new int[maxArr];
		int i = 0,index=0;
		while(index<maxArr) {
			if(i<a1.length) {
				mar2[index++]=a1[i++];
			}
			if(i<a2.length) {
				mar2[index++]=a2[i++];
			}
		}
		System.out.println(Arrays.toString(mar2));
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={1,2,3};
		int arr2[]={4,5,6,7,8,9};
		
		mergeArr(arr1, arr2);
		mergeAlter(arr1, arr2);
		
		
		

	}

}
