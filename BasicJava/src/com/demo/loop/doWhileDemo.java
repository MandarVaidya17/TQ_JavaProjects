package com.demo.loop;
//do while check codition at least one 
//hence it runs at least once
public class doWhileDemo {
	
	public static void show(int n) {
		int i=11;
		do {
			System.out.println(i);
			i++;
		}while(i<=n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show(10);
	}

}
