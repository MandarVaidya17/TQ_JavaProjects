package com.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Boxing
		int num=23;
		Integer i1=Integer.valueOf(num);
		Integer i2=num;//Autoboxing by compiler
		
		System.out.println(i1);
		System.out.println(i2);
		Integer i3=new Integer(78);
		//Unboxing
		Float f1=6.7f;
		float f=f1.floatValue();
		float f2=f1;//by compiler
		
		System.out.println(f2);
	}

}
