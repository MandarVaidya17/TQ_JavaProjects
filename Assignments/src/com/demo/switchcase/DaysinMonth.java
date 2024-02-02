package com.demo.switchcase;

import java.util.Scanner;

public class DaysinMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int month,days = 0;
		
		System.out.println("Enter Month Num");
		month=sc.nextInt();
		
		switch(month) {
		case 1:
		case 3:	
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days=31;
			break;
		case 2:
			days=29;
			break;
		case 4:			
		case 6:		
		case 9:	
		case 11:
			days=30;
			break;
			default:
				System.out.println("Invalid number");
		}
		
			System.out.println(days+" Days");
		
	}

}
