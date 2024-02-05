package com.containment;
//Create a class Payment having a static method payBill(String paytype, double bill)
//If you pay the bill by cash/debit card you are not eligible for any discount
//If payment is by UPI you get cashback of Rs1000 for the bill above 5000
//If you pay by Credit card you get 15% discount on the bill
public class Payment {
	String paytype;
	double bill;
	
	public Payment() {
		
	}
	
	public Payment(String paytype,double bill) {
		this.paytype=paytype;
		this.bill=bill;
	}
	
		
}
