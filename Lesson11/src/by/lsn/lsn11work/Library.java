package by.lsn.lsn11work;

import java.util.Scanner;

public class Library {

	private int counter = 0;
	private String title;
	private Book[] books;

	public Library(String title, Book[] book) {
		super();
		this.title = title;
		// this.book = new Book("Book1", 10);
		// this.book2 = new Book("Book2", 12);
		this.books = book;
	}

	public Library(String title) {
		super();
		this.title = title;
		this.books = new Book[1];
	}

	public Library() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void addBook(Book book) {
		if (counter < books.length) {
			books[counter] = book;
		} else {
			int oldLength = books.length;
			
			Book[] newBooks = new Book[oldLength + 1];
			for (int i = 0; i < books.length; i++) {
				newBooks[i] = books[i];
			}
			newBooks[counter] = book;
			books = newBooks;
			counter++;
		}
	}
	
	public void delBook() {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите название книги: ");
		String n = in.nextLine();
		if (counter == 0) {
			return;
		}
		Book book[] = new Book[counter]; 
		int buf = counter;
		for (int i = 0, j = 0; j < buf; i++, j++) {
				if (books[j].getTitle().equalsIgnoreCase(n)) {
					i--;
					counter--;
					continue;
			}
			book[i] = books[j];
		} 
		books = book;
	}
	
	public void bubbleSort(Book book[]) {
		for (int i = book.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (book[j].getYearPublish() > book[j + 1].getYearPublish()) {
					Book t = book[j];
					book[j] = book[j + 1];
					book[j + 1] = t;
				}
			}
			System.out.println(book[i].getTitle() + " " + book[i].getYearPublish());
		}
	}
	
	public void findBookAuthor(Book book[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите им€ автора: ");
		String auth = in.nextLine();
		for (int i = 0; i < book.length; i++) {
			if ((book[i].getAuthor().equals(auth))) {
				System.out.println(book[i].getTitle());
			}
		}
	}
	
	public void infoBook() {
		for (int i = 0; i < counter; i++) {
			System.out.println(books[i].getTitle() + " " 
					+ books[i].getPageCount() + " " 
					+ books[i].getYearPublish() + " " 
					+ books[i].getAuthor());
		}
	}
}
