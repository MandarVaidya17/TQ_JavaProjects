package com.demo.loops;

public class NumSeries3 {
	public static void printNum() {
		int num=1,num1=2;
		while(num<=100) {
			System.out.println(num);
			num=num+num+1;
			System.out.println(num1);
			num1=num1+num1-1;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNum();
	}

}
