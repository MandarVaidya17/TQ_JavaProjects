package com.demo2;

import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) throws IOException,ArithmeticException
	{
		//throw new ArithmeticException("not a value");
		throw new IOException("invalid input");
		
	}

}
