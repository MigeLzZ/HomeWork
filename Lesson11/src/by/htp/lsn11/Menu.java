package by.htp.lsn11;

import java.util.Scanner;

public class Menu {

	public void menuLibrary(int item, Book book[]) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Добро пожаловать! Выберите действие: ");
		System.out.println("1. Просмотреть список всех книг.");
		System.out.println("2. Вывести книги по году издания.");
		System.out.println("3. Поиск книги по автору.");
		item = in.nextInt();
		
		Library lib = new Library();
		switch (item) {
		case 1:
			//lib.actionsWithBooks();
			break;
		case 2:
			lib.bubbleSort(book);
			break;
		case 3:
			lib.findBookAuthor(book);
			break;
		}
	}
}
