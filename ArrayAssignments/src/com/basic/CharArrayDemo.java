package com.basic;

public class CharArrayDemo {
	static void charArr(char ar[]) {
		for(int i=0;i<ar.length;i++) {
			ar[i]=(char) (ar[i]+1);
			System.out.println(ar[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char arr[]= {'h','j','x','z'};
			charArr(arr);
	}

}
