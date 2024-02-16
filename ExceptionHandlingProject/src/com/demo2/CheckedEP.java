package com.demo2;

import java.io.IOException;

public class CheckedEP {
	void method3() throws IOException{
		throw new IOException("Invalid input");
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
		CheckedEP c=new CheckedEP();
		c.method1();
	}

}
