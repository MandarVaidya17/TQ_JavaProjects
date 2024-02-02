package com.extra_assingment;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int buy_price,sell_price,profit,loss;
		
		System.out.println("Enter Buy Price:");
		buy_price=sc.nextInt();
		System.out.println("Enter sell Price:");
		sell_price=sc.nextInt();
		
		if(sell_price>buy_price) {
			profit=sell_price-buy_price;
			System.out.println("Profit is "+profit);
		}else {
			loss=buy_price-sell_price;
			System.out.println("Loss is "+loss);
		}
		
		
		
	}

}
