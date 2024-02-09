package com.bookarray;

import java.util.Scanner;

public class BookImplementation implements BookDetails{
			Scanner sc=new Scanner(System.in);
			Book b[]=new Book[5];
			int id,price;
			String bname,aname;
			int count=0;
			
			@Override
			public void addBook() {
				System.out.println("Add Book");
				System.out.println("Enter number of books");
				int size=sc.nextInt();
				for(int i=0;i<size;i++) {
					System.out.println("Enter book id");
					id=sc.nextInt();
					System.out.println("Enter book name");
					bname=sc.next();
					System.out.println("Enter book author");
					aname=sc.next();
					System.out.println("Enter book price");
					price=sc.nextInt();
					b[count]=new Book(id, bname, aname, price);
					count++;
				}
				
			}
			@Override
			public void updateBook() {
				System.out.println("Update Book");
				System.out.println("Enter book id");
				id=sc.nextInt();
				for(int i=0;i<count;i++) {
					if(b[i]!=null && b[i].getBookId()==id) {
						System.out.println("Enter price you want to update");
						price=sc.nextInt();
						b[i].setPrice(price);
					}
				}
				
				
			}
			@Override
			public void deleteBook() {
				System.out.println("Delete book");
				System.out.println("Enter the book id for delete");
				id=sc.nextInt();
				for(int i=0;i<count;i++) {
					if(b[i].getBookId()==id) {
						b[i]=null;
						System.out.println("Book deleted successfully");
					}
				}
				
			}
			@Override
			public void searchBook() {
				System.out.println("Search Book");
				System.out.println("Enter Book id");
				id=sc.nextInt();
				for(int i=0;i<count;i++) {
					if(b[i].getBookId()==id) {
						System.out.println("Book found");
						System.out.println(b[i]);
						break;
					}
					if(b[i].getBookId()!=id) {
						System.out.println("Book NOt Found");
						break;
					}
				}
				
			}
			@Override
			public void showAllTheBooks() {
				System.out.println("Show all books");
				for(int i=0;i<count;i++) {
					if(b[i]!=null) {
						System.out.println(b[i]);
					}
				}
				
			}
			@Override
			public void Exit() {
				// TODO Auto-generated method stub
				System.exit(0);
				
			}
			@Override
			public void ExtraBook() {
				
				
				for(int i=count;i<count+1;i++) {
					System.out.println("Enter book id");
					id=sc.nextInt();
					System.out.println("Enter book name");
					bname=sc.next();
					System.out.println("Enter book author");
					aname=sc.next();
					System.out.println("Enter book price");
					price=sc.nextInt();
					b[count]=new Book(id, bname, aname, price);
			
				}
				count++;

				
			}
}
