package com.demo.loop;

public class printCapitals {
	
	public static void printCap() {
		char ch = 'A';
		
		while(ch<='Z') {
			System.out.println(ch);
			ch++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCap();
	}

}
