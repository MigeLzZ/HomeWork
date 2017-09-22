package by.lsn.lsn11work;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Book book1 = new Book("Book1", 15, 2122, "PJ");		
		Book book2 = new Book("Book2", 12, 1998, "Andrew");
		Book book3 = new Book("Book3", 48, 1042, "Vasya");
		Book book4 = new Book("Book4", 123, 999, "Phil");
		Book book5 = new Book("Book5", 124, 1111, "Kate");
		
		Library lib3 = new Library("Lib3");
		lib3.addBook(book1);
		lib3.addBook(book2);
		lib3.addBook(book3);
		lib3.addBook(book4);
		lib3.addBook(book5);
		
		Book bk[] = new Book[5];
		bk[0] = book1;
		bk[1] = book2;
		bk[2] = book3;
		bk[3] = book4;
		bk[4] = book5;
		
		LibraryOperation libOperation = new LibraryDefaultOperation();
		// = libOperation.bubbleSort();
		
		int item = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Добро пожаловать! Выберите действие: ");
		System.out.println("1. Просмотреть список всех книг.");
		System.out.println("2. Вывести книги по году издания.");
		System.out.println("3. Поиск книги по автору.");
		item = in.nextInt();
		
		switch (item) {
		case 1:
			lib3.infoBook();
			lib3.delBook();
			System.out.println(" ");
			lib3.infoBook();
			break;
		case 2:
			lib3.bubbleSort(bk);
			break;
		case 3:
			lib3.findBookAuthor(bk);
			break;
		}
		
	}

}
