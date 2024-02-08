package com.varags;

public class VarAgsDemo {
	
	static void calSum(int ar[]) {
		int sum=0;
		for(int x:ar) {
			sum+=x;
		}
		System.out.println("Sum="+sum);
	}
	//ellipsis
	static void findSum(int ...ar) {
		int sum=0;
		for(int x:ar) {
			sum+=x;
		}
		System.out.println("Sum="+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {2,3,6};
		int a2[]= {1,3,6,8,9};
		calSum(a1);
		calSum(a2);
		
			findSum(2,3,4);
			findSum(11,22,33,44);
	}

}
