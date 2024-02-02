package com.demo.loops;

public class NumSeries2 {
	public static void printNum() {
		int num=2;
		while(num<=100) {
			System.out.println("Num:"+num);
			num=num+num-1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNum();
	}

}
