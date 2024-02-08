package com.varags;

class Parent{
	void display(int ...a) {
		System.out.println("in parent");
	}
}
class Child extends Parent{
	
	void display(int ...a) {
		System.out.println("in child");
	}
}

public class VarArgsOverriding {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.display(3,4,5);

	}

}
