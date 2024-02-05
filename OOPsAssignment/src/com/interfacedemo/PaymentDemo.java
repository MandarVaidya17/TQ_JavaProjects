package com.interfacedemo;
//Create an interface to pay any amount . It can be used by employee or celebrity to pay the tax a
//and by a student to pay the fees
//Use the concept of functional interface here

interface PayAmount{
	default void payTax(int amount) {
		
	}
	
	default void payFee(int amount) {
		System.out.println("Pay fee");
	}
	
}

class Employee implements PayAmount{
	@Override
	public void payTax(int amount) {
		System.out.println("Employee pay the tax:"+amount);
	}
	
}
class Student implements PayAmount{
	@Override
	public void payFee(int amount) {
		System.out.println("Student paying the fees:"+amount);
	}
}
class Celebrity implements PayAmount{
	
	public void payTax(int amount) {
		System.out.println("Celebrity pay the tax:"+amount);
	}
}
public class PaymentDemo {
	
	private PayAmount p;
	private int amount ;
	
	public PayAmount getP() {
		return p;
	}


	public void setP(PayAmount p) {
		this.p = p;
	}
	
	public void paidTax(int amount) {
		this.amount=amount;
		p.payTax(amount);
	}
	public void paidFee(int amount) {
		this.amount=amount;
		p.payFee(amount);
	}
	
	public static void main(String[] args) {
		PaymentDemo p1=new PaymentDemo();
		p1.setP(new Employee());
		p1.paidTax(10000);
		p1.setP(new Student());
		p1.paidFee(1500);
		

	}


	

}
