package com.demo.loop;

public class ContinueKeyword {

	public static void  printNum() {
		int i;
		
		for(i=1;i<=10;i++) {
			if(i==5)
				continue;
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNum();
	}

}
