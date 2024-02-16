package com.override;

import java.io.IOException;

class Parent1{
	int data=50;
	//throw checked exception
	void printData() throws ArithmeticException{
		System.out.println(data);
	}
}

//
class Child1 extends Parent1{
	int val=10;
	
	void printData() throws RuntimeException,ArrayIndexOutOfBoundsException{
		if(val==0)
		System.out.println(val);
	}
}

public class UnCheckedException {
	
	public static void main(String[] args) throws ArithmeticException, IOException {
		Child2 c1=new Child2();
		
		c1.printData();
	}

}
