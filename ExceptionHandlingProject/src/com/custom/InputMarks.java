package com.custom;

import java.util.Scanner;

public class InputMarks {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter marks");
			int marks=sc.nextInt();
			if(marks<0 || marks>100) {
				throw new InvalidMarks("Marks should be between 1 to 100");
			}else if(marks>=35) {
				System.out.println("passed");
			}else
			{
				System.out.println("fail");
			}
			System.out.println("marks:"+marks);
		}
		catch (InvalidMarks e) {
			System.out.println(e);
		}
		finally {
			sc.close();
		}

	}

}
