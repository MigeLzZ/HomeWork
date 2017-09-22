package by.htp.lsn12.logic;

import java.util.Scanner;

import by.htp.lsn12.entity.Book;
import by.htp.lsn12.entity.Catalog;

public class Librarian {
	
	private Scanner sc = new Scanner(System.in);
	
	public Catalog veiwCatalog() {
		
		Catalog catalog = new Catalog();
		
		catalog.addBook(new Book("Book1"));
		catalog.addBook(new Book("Book2"));
		catalog.addBook(new Book("Book3"));
		
		return catalog;		
	}
	
	public Catalog viewScannerCatalog() {
		
		Catalog catalog = new Catalog();
		
		Book book = scanNewBook();
		Book book2 = scanNewBook();
		Book book3 = scanNewBook();
		
		catalog.addBook(book);
		catalog.addBook(book2);
		catalog.addBook(book3);
		
		return catalog;
	}
	
	private Book scanNewBook() {
		
		System.out.println("Enter book title: ");
		String title = sc.next();
		
		Book book = new Book(title);
		return book;
	}

}
