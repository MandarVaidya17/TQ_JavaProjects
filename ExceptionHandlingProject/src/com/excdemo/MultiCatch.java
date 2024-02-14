package com.excdemo;

import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			int arr[]=new int[3];
			for(int i=0;i<=arr.length;i++) {
				System.out.println("Enter a number");
				arr[i]=sc.nextInt();
			}
			System.out.println("---------");
			for(int i=0;i<arr.length;i++) {
				System.out.println("Ans:"+(100/arr[i]));
			}
		}
		catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			//System.out.println(e+" Length of arrays is greater");
			System.out.println(e+" check code");
		}
//		catch (ArithmeticException e) {
//			System.out.println(e+" array element cannot be zero");
//		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			sc.close();
			System.out.println("Finally block");
		}
		System.out.println("rest code");
	}

}
