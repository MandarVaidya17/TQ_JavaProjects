package com.demo.loops;

import java.util.Scanner;

public class whileGuessNum {
	
	public static void guessNum(int num) {
		int guess=50,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No");
		num=sc.nextInt();
		while(num>0) {
			if(num==guess) {
				System.out.println("Guess is right");
				break;
			}else if(num>guess) {
				System.out.println("number is greater than guess");
				System.out.println("Enter No");
				num=sc.nextInt();	
			} else if(num<guess) {
				System.out.println("number is smaller than guess");
				System.out.println("Enter No");
				num=sc.nextInt();	
			}
			count++;	
		}
		System.out.println("count="+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		guessNum(num);
	}

}
