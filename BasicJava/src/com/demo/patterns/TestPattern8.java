package com.demo.patterns;

public class TestPattern8 {
	
	public static void PrintPattern(int n) {
		int i,j,k;
		
		for(i=1;i<=n;i++) {
			for(k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=n-i;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintPattern(7);
	}

}
