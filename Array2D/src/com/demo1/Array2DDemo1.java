package com.demo1;

public class Array2DDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][];
		int[][]arr1;
		int rows=3;
		int cols=3;
		arr=new int[rows][cols];
		
		int no=1;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=no;
				no++;
			}
		}
		
		System.out.println("--------");
		for(int i=0;i<rows;i++) {
			for(int a:arr[i]) {
				System.out.print(a+" " );
			}
			System.out.println();
		}
		System.out.println("--------");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
