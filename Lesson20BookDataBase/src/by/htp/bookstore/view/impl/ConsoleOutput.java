package by.htp.bookstore.view.impl;

import by.htp.bookstore.domain.entity.Book;
import by.htp.bookstore.domain.vo.Catalog;
import by.htp.bookstore.view.SimpleUserOutputter;

public class ConsoleOutput implements SimpleUserOutputter {

	@Override
	public void printBookCatalog(Catalog catalog) {

		if (catalog != null) {
			System.out.println("Catalog title: " + catalog.getTitle());
			System.out.println("Catalog creation date: " + catalog.getDateCreation());
			if (catalog.getBooks() != null) {
				for (Book book : catalog.getBooks()) {
					System.out.println(book);
				}
			}
		}

	}

}
