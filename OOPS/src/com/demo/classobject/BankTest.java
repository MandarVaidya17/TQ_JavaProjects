package com.demo.classobject;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
		//System.out.println(b1.accno);
		//System.out.println(b1.name);
		//System.out.println(b1.balance);
		b1.setData(101, "pablo", 0.0);
		b1.setAccno(12345678);
		b1.displayData();
		//System.out.println(b1.getAccno());
		b1.setBalance(5000);
		//System.out.println(b1.getBalance());
		b1.displayData();
	}

}
