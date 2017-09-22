package by.itacademy.catalog.dao;

import java.util.List;

import by.itacademy.catalog.domain.entity.Book;

public interface BookDao {

	List<Book> readBooks();
	
	void addBook(Book book) throws DaoException;
	
	Book getBook(int id) throws DaoException;
	
	void deleteBook(int bookId);
	
}
