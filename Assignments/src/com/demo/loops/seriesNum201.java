package com.demo.loops;

public class seriesNum201 {
	
	public static void printNum() {
		int i = 1,n=0;
		while(i<=20) {
			System.out.println("num="+n);
			n=n+n+1;
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNum();
	}

}
