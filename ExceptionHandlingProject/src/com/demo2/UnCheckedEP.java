package com.demo2;

import java.io.IOException;

public class UnCheckedEP {
	void method3() throws IOException{
		int data=50/0;
	}
	
	void method2() throws IOException{
		method3();
	}
	void method1() {
		try {
			method2();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		UnCheckedEP c=new UnCheckedEP();
		c.method1();

	}

}
