package com.demo1;

public class Array2DDemo2 {
	public static void main(String[] args) {
		int arr[][]=new int[][] {{1,1},{2,2},{3,3},{4,4}};
		System.out.println("-----------------------");
		for(int i=0;i<arr.length;i++) {
			for(int a:arr[i]) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
