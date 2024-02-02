package com.basic;

public class SearchArray {
	static boolean searchElement(int ar[],int ele) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==ele) 
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int arr[]= {2,3,5,1,6,8};
			if(searchElement(arr, 11)) {
				System.out.println("Found ");
			}else {
				System.out.println("Not Found");
			}
	}

}
