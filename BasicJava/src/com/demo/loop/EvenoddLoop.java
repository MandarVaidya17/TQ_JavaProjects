package com.demo.loop;

public class EvenoddLoop {
	
	public static void evenOdd() {
		
		int i;
		for(i=1;i<=15;i++) {
			if(i%2==0) {
				System.out.println(i+" is Even");
			}
			else {
				System.out.println(i+" is Odd");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenOdd();
	}

}
