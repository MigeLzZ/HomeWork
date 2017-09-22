package by.itacademy.catalog.service.impl;

import by.itacademy.catalog.dao.BookDao;
import by.itacademy.catalog.dao.DaoException;
import by.itacademy.catalog.dao.impl.BookDaoImpl;
import by.itacademy.catalog.domain.entity.Book;
import by.itacademy.catalog.domain.vo.Catalog;
import by.itacademy.catalog.service.CatalogService;

public class SimpleCatalogImpl implements CatalogService{

	private BookDao dao;
	
	{ // Логический блок.
		dao = new BookDaoImpl();
	}
	
	@Override
	public Catalog getCatalog() {
		
		Catalog catalog = new Catalog();
		catalog.setTitle("New Catalog");
		catalog.setBooks(dao.readBooks());
		
		return catalog;
	}

	@Override
	public void addBook(Book book) {
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
				book = dao.getBook(id);
			} catch (DaoException e) {				
				e.printStackTrace();
			}
		}
		return book;
	}

	@Override
	public void removeBook(int bookId) {
		
		dao.deleteBook(bookId);
		
	}

}
