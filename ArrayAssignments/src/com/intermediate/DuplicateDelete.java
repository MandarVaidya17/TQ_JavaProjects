package com.intermediate;

import java.util.Arrays;

public class DuplicateDelete {
	static void deleteDup(int ar[]) {
		int count;
		boolean status;
		int index = 0;
		
		for(int i=0;i<ar.length;i++) {
			count=1;
			status=false;
			
			for(int j=i-1;j>=0;j--) {
				if(ar[i]==ar[j]) {
					status=true;
					break;
				}
			}
			
			if(status==false) {
				
				for(int k=i+1;k<ar.length;k++) {
					if(ar[i]==ar[k]) {
						count++;
					}
					
				}
				if(count>=1) {
					index++;
					int temp[]=new int[index];
					temp[index]=ar[i];
					
					System.out.println(Arrays.toString(temp));
				}
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,2,1,1,4,3};
		deleteDup(arr);
	}

}
