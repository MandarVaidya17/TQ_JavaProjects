package com.excdemo;

public class NestedTry {
	public static void main(String[] args) {
		int arr[]= {1,2,0,4,5,6};
		
		try {
			for(int i=0;i<arr.length;i++) {
				try {
					System.out.println(100/arr[i]);
				}
				catch (Exception e) {
					System.out.println(e);
				}
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
