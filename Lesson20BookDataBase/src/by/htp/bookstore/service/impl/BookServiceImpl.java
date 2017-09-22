package by.htp.bookstore.service.impl;

import java.util.Date;
import java.util.List;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.dao.DaoException;
import by.htp.bookstore.dao.impl.BookDaoFactory;
import by.htp.bookstore.dao.impl.BookFileImpl;
import by.htp.bookstore.dao.impl.BookMySQLImpl;
import by.htp.bookstore.dao.impl.sax.BookSaxParser;
import by.htp.bookstore.domain.entity.Book;
import by.htp.bookstore.domain.vo.Catalog;
import by.htp.bookstore.service.BookService;

public class BookServiceImpl implements BookService{

	// Change to factory.
	//private BookDao dao =  new BookMySQLImpl();
	//private BookDao dao = new BookFileImpl();
	
	//private BookDao dao = new BookSaxParser();
	// !!!!!!!!! CHange to private BookDao dao = new BookStaxParser();
	// !!!!!!!!! Change to private BookDao dao = new BookDomParser();
	
	private BookDao dao;

	public BookServiceImpl(String source) {
		super();
		dao = BookDaoFactory.getBookDao(source);	
	}
	
	@Override
	public Catalog getBookCatalog() {
		
		List<Book> books = dao.readBooks();
		
		String catalogTitle = "Daily Catalog";
		Date dateCreation = new Date();
		
		Catalog catalog = new Catalog(catalogTitle, dateCreation, books);
		//catalog.setBooks(books);
		
		return catalog;
	}

	@Override
	public void addNewBook(Book book) {
		if(book != null) {
			try {
				dao.addBook(book);
			} catch (DaoException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Book getBook(int id) {
		Book book = null;
		if (id > 0) {
			try {
				book = dao.readBook(id);
			} catch (DaoException e) {				
				e.printStackTrace();
			}
		}
		return book;
	}

	@Override
	public void delBook(int id) {
		if (id > 0) {
			try {
				Book book = dao.deleteBook(id);
			} catch(DaoException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void updateBook(Book book, int id) {
		if (book != null && id > 0) {
			try {
				dao.updateBook(book, id);
			} catch(DaoException e) {
				e.printStackTrace();
			}
		}
		
	}
}
