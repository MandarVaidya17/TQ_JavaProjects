package com.basic;

public class MinCharArr {
	
	static void minChar(char ar[]) {
		
		char minC=ar[0];
		int i;
		
		for( i=0;i<ar.length;i++) {
			if(minC>ar[i]) {
				minC=ar[i];
			}
		}
		System.out.println(minC);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'x','z','u','b','j'};
		minChar(arr);

	}

}
