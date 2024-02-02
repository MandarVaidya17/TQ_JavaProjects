package com.conditionaloperator;

import java.util.Scanner;

public class WithdrawCash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n500=0,n200=0,n100=0,n50=0,n20=0,n10=0,amount;
		
		
		System.out.println("Enter Amount :");
		amount=sc.nextInt();
		
		if(amount>=500) {
			n500=amount/500;
			amount=amount%500;
			System.out.println(n500+" Note RS 500 ");
		}
		if(amount>=200){
			n200=amount/200;
			amount=amount%200;
			System.out.println(n200+" Note RS 200 ");
		}
		if(amount>=100) {
			n100=amount/100;
			amount%=100;
			System.out.println(n100+" Notes RS 100 ");
		}
		if(amount>=50) {
			n50=amount/50;
			amount=amount%50;
			System.out.println(n50+" Note RS 50 ");
		}
		if(amount>=20) {
			n20=amount/20;
			amount=amount%20;
			System.out.println(n20+" Note RS 20 ");
		}
		if(amount>=10) {
			n10=amount/10;
			amount=amount%10;
			System.out.println(n10+" Note RS 10 ");
		}
	}

}
