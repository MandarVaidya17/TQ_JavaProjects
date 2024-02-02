package com.demo.loops;

import java.util.Scanner;

public class PowerofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int base,index,power = 1,i;
		
		System.out.println("Enter Base & Index");
		base=sc.nextInt();
		index=sc.nextInt();
		
		for(i=1;i<=index;i++) {
			power*=base;
		}
		System.out.println(power);
	}

}
