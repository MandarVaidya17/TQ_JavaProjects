package com.containment;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a1=new Author("Mark Manson",999);
		Author a2=new Author("Pablo",998);
		
		Book b1=new Book(101,"The Subtle Art",a1);
		System.out.println(b1);
	}

}
