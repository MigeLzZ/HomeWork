package by.htp.lsn12.logic;

import by.htp.lsn12.entity.Book;
import by.htp.lsn12.entity.Catalog;

public class LibrarianDefaultOperationImpl implements LibrarianOperation{

	@Override
	public Catalog viewCatalog() {
		
		Catalog catalog = new Catalog();
		
		catalog.addBook(new Book("Book1"));
		catalog.addBook(new Book("Book2"));
		catalog.addBook(new Book("Book3"));
		
		return catalog;	
	}

	@Override
	public Catalog viewCatalog2() {
		// TODO Auto-generated method stub
		return null;
	}

}
