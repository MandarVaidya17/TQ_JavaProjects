package com.interfacedemo;
interface Suzuki{
	void car();

default void model() {
	System.out.println("Sadan");
}
}
interface Maruti{
	void car();
	
	default void model() {
		System.out.println("suv");
	}
}


class Swift implements Maruti,Suzuki{

	@Override
	public void car() {
		System.out.println("This is maruti suxuki car");

	}
	public void model() {
		System.out.println("samicompact");
		Suzuki.super.model();
		Maruti.super.model();
	}
	
	
}
public class DiamondDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suzuki s1;
		s1=new Swift();
		s1.car();
		s1.model();
	}

}
