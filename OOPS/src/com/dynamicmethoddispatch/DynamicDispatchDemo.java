package com.dynamicmethoddispatch;

class Bank{
	int in;
	void setIntrest() {
		System.out.println("Intrest:"+in);
	}
}

class SbiBank extends Bank{
	
	void setIntrest() {
		in=6;
		System.out.println("Intrest:"+in);
	}
	void show() {
		System.out.println("SBI Akole Branch.");
	}
}

class HdfcBank extends Bank{
	void setIntrest() {
		in=5;
		System.out.println("Intrest:"+in);
	}
}

public class DynamicDispatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b=new SbiBank();
		b.setIntrest();
		//b.show();
		
		b=new HdfcBank();
		b.setIntrest();
	}

}
