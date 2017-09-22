package by.htp.bookstore.dao.impl;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.dao.impl.STax.BookStaxParser;
import by.htp.bookstore.dao.impl.dom.BookDomParser;
import by.htp.bookstore.dao.impl.sax.BookSaxParser;

public class BookDaoFactory {
	
	private BookDaoFactory() {		
	}
	public static BookDao getBookDao(String source) {
		if("File".equals(source)) {
			return new BookFileImpl();
		} else if("MySQL".equals(source)) {
			return new BookMySQLImpl();
		}else if("SAX".equals(source)) {
			return new BookSaxParser();
		}else if("StAX".equals(source)) {
			return new BookStaxParser();
		}
		else if("DOM".equals(source)) {
			return new BookDomParser();
		}
		else {
			throw new IllegalArgumentException("Bad source: " + source);
		}				
	}
}
