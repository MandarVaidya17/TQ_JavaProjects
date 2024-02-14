package com.excdemo;

public class SecondException {
	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		try {
			int arr[]= {1,2,3};
			System.out.println("value:"+arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Rest code");
	}
}
