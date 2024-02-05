package com.interfacedemo;
interface Payment
{
	void pay(double amount);
}

class cake implements Bakery,Payment
{

	@Override
	public void bake() {
		System.out.println("Variety:Pinapple,chocolate,buttercoach");
		
		
	}
	public void displayRates() {
		System.out.println("Pinaple:300");
		System.out.println("Chocolate:400");
	}

	@Override
	public void minOrder() {
		System.out.println("500g");
		
	}

	@Override
	public void pay(double amount) {
		
		System.out.println("Payment done:"+amount);
	}
	
	
}

class Biscute implements Bakery
{

	@Override
	public void bake() {
		
		System.out.println("Variety:almond,chocolate");
	}

	@Override
	public void minOrder() {
		System.out.println("250g");
		
	}

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Bakery b;
		Payment p;
		p=new cake();
		b=new cake();
		b.bake();
		//b.displayRates();
		b.minOrder();
		p.pay(200);
		
	}

}
