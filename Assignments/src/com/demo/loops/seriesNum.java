package com.demo.loops;

public class seriesNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=2;
		
		for(i=1;i<=8;i++) {
			
			
			if(i%2==0) {
				System.out.println(-n);
			}else {
				System.out.println(n);
			}
			n=n+2;
		}
	}

}
