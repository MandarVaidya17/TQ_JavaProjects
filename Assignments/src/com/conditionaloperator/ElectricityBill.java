package com.conditionaloperator;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int unit;
		double rs = 0,addcharge,billamount;
		
		System.out.println("Enter the units:");
		unit=sc.nextInt();
		
		if(unit<=50) {
			rs=unit*0.5;
			
		}else if(unit<=150) {
			rs=unit*0.75;
			//System.out.println("electricity bill amount is "+rs);
		}else if(unit<=250) {
			rs=unit*1.20;
			//System.out.println("electricity bill amount is "+rs);
		}else if(unit>250) {
			rs=(unit*1.50);
			
		}
		addcharge= rs*0.2;
		billamount=rs+addcharge;
		System.out.println("electricity bill amount is "+billamount);
	}

}
