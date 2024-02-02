package com.demo.patterns;

public class TestPattern5 {
	public static void PrintPattern(int n) {
		int i,j,k;
		
		for(i=n;i>=1;i--) {

			for(j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintPattern(5);
	}

}
