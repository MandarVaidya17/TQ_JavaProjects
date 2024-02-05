package com.demo.loop;

public class Divisibleby5Loop {
	
	public static void divLoop() {
		
		int i;
		for(i=1;i<=50;i++) {
			if(i%5==0) {
				System.out.println(i+" is divisible by 5");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divLoop();
	}

}
