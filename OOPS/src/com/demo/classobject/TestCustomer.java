package com.demo.classobject;

class Customer{
	int custid;
	String custname;
	
	public void setData(int cid,String cname) {
		custid=cid;
		custname=cname;
	}
	public void showData() {
		System.out.println("customer id:"+custid);
		System.out.println("Customer name:"+custname);
		System.out.println("-------------------------");
	}
}
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		Customer c2=new Customer();
		Customer c3=new Customer();
		
		c1.setData(1, "Raj");
		c2.setData(2, "Radha");
		c3.setData(3, "Pablo");
		c1.showData();
		c2.showData();
		c3.showData();
	}

}
