package com.containment;

public class Book {
	
	private int bookId;
	private String bookName;
	private Author author;
	
	public Book() {
		
	}
	public Book(int bookId,String bookName,Author author) {
		this.bookId=bookId;
		this.bookName=bookName;
		this.author=author;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String toString() {
		return "BookId:"+bookId+" Book:"+bookName+" AuthorDetails:"+author;
	}
	

}
