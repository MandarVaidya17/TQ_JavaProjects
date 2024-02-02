package com.demo.loops;

import java.util.Scanner;

public class TablesNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num,i;
		System.out.println("Enter num ");
		num=sc.nextInt();
		for(i=1;i<=10;i++) {
			System.out.println(num+" *"+i+" = "+num*i);
		}
	}

}
