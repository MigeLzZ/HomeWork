package by.htp.bookstore.dao;

import java.util.List;

import by.htp.bookstore.domain.entity.Book;

public interface BookDao {

	List<Book> readBooks();
	
	Book readBook(int id) throws DaoException;
	
	Book deleteBook(int id) throws DaoException;
	
	void addBook(Book book) throws DaoException;

	void updateBook(Book book, int id) throws DaoException;
	
}
