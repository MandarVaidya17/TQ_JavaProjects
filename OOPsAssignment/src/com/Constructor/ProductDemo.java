package com.Constructor;

import java.util.Scanner;

//Write a Java program to create Product class as per below details
//Data member : proId,name,description,price,quantity and discount
//methods : displayProduct,calculateTotalPrice(),calculateDiscountPrice()

class Product{
	private int proid,price,quantity,total;
	private String proname,discription;
	private double discount;
	static Scanner sc=new Scanner(System.in);
	
	public Product() {
		
	}
	
	public Product(int proid,String proname,int price,int quantity) {
		this.proid=proid;
		this.proname=proname;
		this.price=price;
		this.quantity=quantity;
	}
	
	
	public int getProid() {
		return proid;
	}


	public void setProid(int proid) {
		this.proid = proid;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public void getDetails() {
		System.out.println("Enter product id:");
		proid=sc.nextInt();
		System.out.println("Enter product name:");
		proname=sc.next();
		System.out.println("Enter price:");
		price=sc.nextInt();
		System.out.println("Enter qty:");
		quantity=sc.nextInt();
	}

	public int totalPrice() {
		total=price*quantity;
		return total;
	}
	public double discountPrice() {
		double per=100/discount;
		
		double disPrice=totalPrice()/per;
		return disPrice;
	}
	public void comparePrice(Product obj) {
		if(this.price>obj.price) {
			System.out.println(this.proname+" has more price than "+obj.proname);
		}else {
			System.out.println(obj.proname+" has more price than "+this.proname);
		}
	}
	
	public void display() {
		System.out.println("ID:"+proid);
		System.out.println("Name:"+proname);
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+quantity);
		System.out.println("Total Price:"+totalPrice());
		System.out.println("Discount:"+discountPrice());
		System.out.println("After Discount total"+(totalPrice()-discountPrice()));
		
	}
	
	
}

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		Product p2=new Product();
		p1.getDetails();
		p1.totalPrice();
		p1.setDiscount(15);
		p1.discountPrice();
		p1.display();
		p1.comparePrice(p2);
	}

}
