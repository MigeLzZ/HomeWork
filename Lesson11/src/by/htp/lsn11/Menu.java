package by.htp.lsn11;

import java.util.Scanner;

public class Menu {

	public void menuLibrary(int item, Book book[]) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("����� ����������! �������� ��������: ");
		System.out.println("1. ����������� ������ ���� ����.");
		System.out.println("2. ������� ����� �� ���� �������.");
		System.out.println("3. ����� ����� �� ������.");
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
