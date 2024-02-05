package com.demo.classobject;

public class Book {
	int bookid;
	String bookname;
	double bookprice;
	
	public void readbook() {
		System.out.println("read book intance variable");
	}

	public static void main(String[] args) {
		
		System.out.println(new Book().bookid);
		System.out.println(new Book().bookname);
		System.out.println(new Book().bookprice);
		
		Book b1=new Book();
		System.out.println(b1.bookid);
		System.out.println(b1.bookname);
		System.out.println(b1.bookprice);
		
		b1.readbook();

	}

}
