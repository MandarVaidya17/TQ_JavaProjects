package com.basic;

public class ArrayLogic {
	
	static boolean searchElement(int ar[],int ele) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==ele) 
				return true;
		}
		return false;
	}
	
	static void serchElementPosition(int ar[],int ele) {
		boolean flag=false;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==ele) {
				flag=true;
				System.out.println("position:"+i);
			}
		}
		if(!flag) {
			System.out.println("Not found");
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {2,3,5,7,9,7,12,22,1};
		
		if(searchElement(arr, 12)) {
			System.out.println("element found");
		}else {
			System.out.println("element not found");
		}
		
		serchElementPosition(arr, 7);
	}

}
