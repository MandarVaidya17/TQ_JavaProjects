package com.extra_assingment;

import java.util.Scanner;

public class Percentage1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int phy,math,chem,comp,bio,percentage,total;
		
		
		System.out.println("Enter Marks");
		phy=sc.nextInt();
		math=sc.nextInt();  
		chem=sc.nextInt();
		comp=sc.nextInt();
		bio=sc.nextInt();
		
		total=phy+math+chem+comp+bio;
		percentage=total/5;
		System.out.println(percentage);
		
		
		if(percentage>=90) {
			System.out.println("Grade A");
		}else if(percentage>=80) {
			System.out.println("Grade B");
		}else if(percentage>=70) {
			System.out.println("Grade c");
		}else if(percentage>=60) {
			System.out.println("Grade D");
		}else if(percentage>=40) {
			System.out.println("Grade E");
		}else if(percentage<40) {
			System.out.println("Grade F");
		}
	}

}
