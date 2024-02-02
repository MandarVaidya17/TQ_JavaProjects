package com.extra_assingment;

import java.util.Scanner;

public class TwoHavles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num:");
		int num=sc.nextInt();

		
		int i,count=0;
		int temp=num;
		int rem = 0,sum,sqr;
		/*while(num!=0) {
			rem=num%10;
			num=num/10;
			count++;
		}
		System.out.println(count);*/
		
			rem=num%100;
			num=num/100;
			sum=rem+num;
			sqr=sum*sum;
	//	System.out.println(sqr);
		
		if(sqr==temp) {
			System.out.println("A tech number has even number of digits "+sqr);
		}
		
	}

}
