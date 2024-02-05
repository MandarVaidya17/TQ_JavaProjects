package com.merge;

import java.util.Arrays;

public class MeargeArray {
	
	static int[] meargeArr(int a1[],int a2[]) {
		
		int len1=a1.length;
		int len2=a2.length;
		int mar[]=new int[len1+len2];
		int index=0;
		for(int i=0;i<len1;i++) {
			mar[index++]=a1[i];
		}
		for(int i=0;i<len2;i++) {
			mar[index++]=a2[i];
		}
		
		return mar;
		
	}

	static int[] meargeAlter(int a1[],int a2[]) {
		
		int len1=a1.length;
		int len2=a2.length;
		int mar[]=new int[len1+len2];
		int i,j,index=0;
		for(i=0,j=0;i<len1&&j<len2;i++,j++) {
			
		mar[index++]=a1[i];
		mar[index++]=a2[i];
			
		}
		
		while(i<len1) {
			mar[index++]=a1[i++];
		}
		while(j<len2) {
			mar[index++]=a2[j++];
		}
		
		return mar;
		
	}
		static int[] meargeAlterSkip(int a1[],int a2[]) {
			
		
		int len1=a1.length;
		int len2=a2.length;
		int maxIndex=Math.max(len1, len2);
		int mar[]=new int[maxIndex];
		int i=0,index=0;
		
		while(index<maxIndex) {
			if(i<a1.length) {
				mar[index++]=a1[i++];
			}
			if(i<a2.length) {
				mar[index++]=a2[i++];
			}
		}
		
		return mar;
		
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={2,3,5,8};
		int arr2[]= {10,20,30,40,50};
		int m[]=meargeArr(arr1, arr2);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("After mearge array");
		System.out.println(Arrays.toString(m));
		
		System.out.println("--------------------------");
		int m1[]=meargeAlter(arr1, arr2);
		
		System.out.println("After Alter mearge array");
		System.out.println(Arrays.toString(m1));
		
		System.out.println("-----------------------------------");
		int m2[]=meargeAlterSkip(arr1, arr2); 
		
		System.out.println("After alter mearge skip array");
		System.out.println(Arrays.toString(m2));
		



	}

}
