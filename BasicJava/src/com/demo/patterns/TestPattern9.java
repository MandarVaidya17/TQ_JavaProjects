package com.demo.patterns;

public class TestPattern9 {
	
	public static void printPattern(int n) {
		int i,j,k;
		for(i=1;i<=n;i++) {
			
			for(k=n;k>=i;k--) {
				System.out.print(" ");
			}
			for(j=1;j<(i-1)*2;j++) {
				System.out.print(" ");
				}
			if(i==1) {
				System.out.println("");
			}else {
			System.out.println("*");
			}
		}
		for(i=1;i<=n;i++) {
			for(k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=n-i;j++) {
				System.out.print(" *");
				
			}
			System.out.println();
		}
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		printPattern(5);
	}

}
