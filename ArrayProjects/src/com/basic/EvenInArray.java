package com.basic;

public class EvenInArray {
		public static void main(String[] args) {
			int arr[]= {12,13,14,16,17};
			for(int i=0;i<arr.length;i++) {
				if((arr[i]%2)==0) {
					System.out.println("Even No:"+arr[i]);
				}
			}
		}
}
