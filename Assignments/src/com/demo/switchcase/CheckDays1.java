package com.demo.switchcase;

import java.util.Scanner;

public class CheckDays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int day;
		
		System.out.println("Enter day");
		day=sc.nextInt();
		
		switch(day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			System.out.println("Day exist");
			break;
			default:
				System.out.println("error, day does not exist");
		}
	}

}
