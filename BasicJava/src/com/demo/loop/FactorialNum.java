package com.demo.loop;

public class FactorialNum {
	
	public static void printFact(int n) {
		int i,j,fact;
		
		for(i=1;i<=n;i++) {
			fact=1;
			for(j=1;j<=i;j++) {
				fact=fact*j;
			}
			System.out.println(i+"!= "+fact);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFact(9);
	}

}
