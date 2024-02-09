package com.bookarray;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDetails b=new BookImplementation();
		do {
			System.out.println("1.Add Book\n2.Update Book\n3.Delete Book\n4.Search Book\n5.Show all Books\n6.ExtraBook\n7Exit");
			
			System.out.println("Enter Choice");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				b.addBook();
				break;
			case 2:
				b.updateBook();
				break;
			case 3:
				b.deleteBook();
				break;
			case 4:
				b.searchBook();
				break;
			case 5:
				b.showAllTheBooks();
				break;
			case 6:
				b.ExtraBook();
				break;
			case 7:
				b.Exit();
				break;
			}
		}while(true);
			
	}

}
