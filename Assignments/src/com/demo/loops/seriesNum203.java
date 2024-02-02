package com.demo.loops;

public class seriesNum203 {
	
	public static void printNum() {
		int i=1,num=1,num1=2;
		while(i<=20) {
			System.out.println(num);
			num=num+num+1;
			System.out.println(num1);
			num1=num1+num1-1;
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNum();
	}

}
