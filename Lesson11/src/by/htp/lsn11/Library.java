package by.htp.lsn11;

import java.util.Scanner;

public class Library {

	public void addBook(Book book[]) {
		int i = 0;

		if (i <= book.length) {
			book[i] = new Book();
			i++;
		}
		if (i > book.length) {
			book[i] = book[i + 1];
			book[i + 1] = new Book();
			i++;
		}
	}

	public void delName(Book book[], Book book1[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите им€ автора: ");
		String n = in.nextLine();
		int i = 0;
		int j = 0;
		for (i = 0; i < book.length; i++) {
			for (j = 0; j < book1.length; j++) {
				if (book[i].getName().equals(n)) {
					i--;
				}
			}
			book[i] = book1[j];
		} 
		book = book1;
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
			System.out.println(book[i].getName() + " " + book[i].getYearPublish());
		}
	}

	public void findBookAuthor(Book book[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите им€ автора: ");
		String auth = in.nextLine();
		for (int i = 0; i < book.length; i++) {
			if ((book[i].getAuthor().equals(auth))) {
				System.out.println(book[i].getName());
			}
		}
	}
}
