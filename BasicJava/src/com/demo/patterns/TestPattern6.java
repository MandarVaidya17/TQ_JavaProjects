package com.demo.patterns;

public class TestPattern6 {
	
	public static void showPattern(int n) {
		int i,j,k;
		for(i=1;i<=n;i++) {
			
			for(k=n;k>=i;k--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showPattern(5);
	}

}
