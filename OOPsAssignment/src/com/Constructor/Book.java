package com.Constructor;
//Task1: Create a class Book with the following details : id, name , price, category
//Create  methods to calDiscount(), compareDiscCost() 
//Create 4 objects of books by taking the user input and then compare the cost of any 2 books


public class Book {
		private int id,price;
		private String name;
		double discount,dis;
		
		public Book() {
			
		}
		public Book(int id,String name,int price) {
			this.id=id;
			this.name=name;
			this.price=price;
		}
		
		public void setId(int id) {
			this.id=id;
		}
		public int getId() {
			return id;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public double getDiscount() {
			return discount;
		}
		public void setDiscount(double discount) {
			this.discount = discount;
		}
		
		public double calDiscount() {
			dis= price-((discount/100)*price);
			return dis;
		}
		
		public void compareDiscCost(Book obj) {
			if(this.dis>obj.dis) {
				System.out.println(this.name+" Book Price is greater than "+obj.name);
			}
			else {
				System.out.println(obj.name+" Book Price is greater than "+this.name);
			}
			
		}
		public String toString() {
			return "ID: "+id+"\nBOOK Name: "+name+"\nPrice: "+price+"\nDiscount: "+10+"%"+"\nDicPrice: "+calDiscount(); 
		}
}
