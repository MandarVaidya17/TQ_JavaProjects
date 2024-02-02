package com.extra_assingment;

public class SeriesNumFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, num=7,num1=10,n=11;
		while(i>=0) {
			
			System.out.println(num);
			num=num+1;
			System.out.println(num1);
			num1=num1+1;
			i++;
			
			if(num==n || num1==n) {
				System.out.println("number is in list");
			
			}else {
				System.out.println("no is not in list");
				
			}
		}
		
		
	}

}
