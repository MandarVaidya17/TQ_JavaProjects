package com.override;

import java.io.IOException;

class Parent2{
	int data=50;
	//throw checked exception
	void printData() throws IOException{
		System.out.println(data);
	}
}

//
class Child2 extends Parent2{
	int val=10;
	
	void printData() throws ArithmeticException,IOException{
		System.out.println(val);
	}
}

public class CheckedException {
		public static void main(String[] args) throws ArithmeticException, IOException {
			Child2 c1=new Child2();
			c1.printData();
		}
		
}
