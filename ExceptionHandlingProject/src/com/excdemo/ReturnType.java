package com.excdemo;

public class ReturnType {
	static int method1(int data) {
		try {
			return 30/data;
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	static int method2(int data) {
		try {
			return 30/data;
		}
		catch (Exception e) {
			System.out.println(e);
			return -1;
		}
		//return 0;
	}
	//finally block override any return values from try and catch block.
	@SuppressWarnings("finally")
	static int method3(int data) {
		try {
			return 30/data;
		}
		catch (Exception e) {
			System.out.println(e);
			return -1;
		}
		finally {
			return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println(method1(3));
		System.out.println(method1(0));
		System.out.println("-------------------");
		System.out.println(method2(3));
		System.out.println(method2(0));
		System.out.println("-------------------");
		System.out.println(method3(3));
		System.out.println(method3(0));
		
	}

}
