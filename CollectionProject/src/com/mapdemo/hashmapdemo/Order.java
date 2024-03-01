package com.mapdemo.hashmapdemo;

public class Order {
	
	private int id;
	private String oname;
	private double price;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, String oname, double price) {
		super();
		this.id = id;
		this.oname = oname;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", oname=" + oname + ", price=" + price + "]";
	}
	
	

}
