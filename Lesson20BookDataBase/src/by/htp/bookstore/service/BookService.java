package by.htp.bookstore.service;

import by.htp.bookstore.domain.entity.Book;
import by.htp.bookstore.domain.vo.Catalog;

public interface BookService {

	Catalog getBookCatalog();
	
	void addNewBook(Book book);
	
	Book getBook(int id);
	
	void delBook(int id);

	void updateBook(Book book, int id);
	
}
