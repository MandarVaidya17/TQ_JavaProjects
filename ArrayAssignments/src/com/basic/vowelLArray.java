package com.basic;

public class vowelLArray {
	
	static void vowelArr(char ar[]) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]=='a' || ar[i]=='i'|| ar[i]=='e' || ar[i]=='o' || ar[i]=='u') {
				System.out.println(ar[i]);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'m','a','n','d','a','r'};
			vowelArr(arr);
	}

}
