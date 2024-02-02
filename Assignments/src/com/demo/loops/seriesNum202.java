package com.demo.loops;

public class seriesNum202 {
	
	public static void printNum(){
		int i=1,num=2;
		while(i<=20) {
			System.out.println("num="+num);
			num=num+num-1;
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNum();
	}

}
