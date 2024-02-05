package com.interfacedemo;
//Create an online shopping which has various modes to paythe Bill
//If paid through cash.. no discount
//Paytm ... above 1000,, cashback 500
//Credit card .. any amount : 20% discount
//Debit card.... above 5000 : 20% discount
//Try to the pay bill using different modes

interface Account{
	 String bankName="SBI";
	static long accountNo=98765678;
	void paymentMode(int amount);
}

class Cash implements Account{

	@Override
	public void paymentMode(int amount) {
		System.out.println("Your payment is in cash then no discount:TotalBill:"+amount);
		
	}
	
}

class Paytm implements Account{
		
	@Override
	public void paymentMode(int amount) {	
		if(amount>1000)
			System.out.println("You Have 500 rs cashback totalBill: "+(amount-500));
		else 
			System.out.println("you have no offer total totalBill:"+amount);
	}
	
}

class CreaditCard implements Account{

	@Override
	public void paymentMode(int amount) {
		int dicount=(int)(amount*0.2);
		System.out.println("You have 20% discount on Credit Card:total Bill:"+(amount-dicount));
		
	}
	
}
class DebitCard implements Account{

	@Override
	public void paymentMode(int amount) {
		int discount=(int) (amount*0.2);
		if(amount>5000)
			System.out.println("You have 20% discount on Debit card :Bill:"+(amount-discount));
		else
			System.out.println("You have no discount");
		
	}
	
}

public class OnlineShopping {
	
	private Account a;
	private int amount;
	
	public Account getA() {
		return a;
	}

	public void setA(Account a) {
		this.a = a;
	}
	public void shop(int amount) {
		this.amount=amount;
		a.paymentMode(amount);
	}

	public static void main(String[] args) {
		System.out.println("Bank Name:"+Account.bankName);
		//System.out.println("Account NO:"+Account.accountNo);
		OnlineShopping o1=new OnlineShopping();
		o1.setA(new DebitCard());
		o1.shop(10000);
		o1.setA(new CreaditCard());
		o1.shop(3400);
		o1.setA(new Cash() );
		o1.shop(1000);
		o1.setA(new Paytm());
		o1.shop(1200);
		

	}

	

}
