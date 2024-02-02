package com.extra_assingment;

public class PrimeNumExtraAss {
	
	public static int primeNum() {
		int i,n = 0,j;
		
		
		for(i=1;i<=100;i++) {
			int count=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
					
				}
				
			}
			if(count==2) {
				n=i;
			}
			
		}
		return n;
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		if(primeNum()<=100) {
		System.out.println(primeNum());
		}
		
	}

}
