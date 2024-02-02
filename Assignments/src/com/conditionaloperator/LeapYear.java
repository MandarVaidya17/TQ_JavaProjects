package com.conditionaloperator;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int year;
		String leap;
		
		 System.out.println("Enter Year");
		year=sc.nextInt();
		
		/*if(year % 4==0 || year %400==0 && year % 100!=0) {
			System.out.println("Its a leap year");
		}else {
			System.out.println("Not a leap year");
		}*/
		
		leap=((year%4==0 && year%100!=0)? "leap year" : (year%400==0)? "leap year" : "not leap year");
		System.out.println(leap);
	}

}
