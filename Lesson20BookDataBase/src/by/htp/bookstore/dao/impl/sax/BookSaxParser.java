package by.htp.bookstore.dao.impl.sax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.dao.DaoException;
import by.htp.bookstore.domain.entity.Book;

public class BookSaxParser implements BookDao{

	@Override
	public List<Book> readBooks() {
		
		BookHandler bh = new BookHandler();
		try {
			XMLReader reader = XMLReaderFactory.createXMLReader();//Почему нету метода close()?			
			reader.setContentHandler(bh);
			reader.parse("xmldocs/books.xml");			
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bh.getBooks();
	}

	@Override
	public Book readBook(int id) throws DaoException {
		// Not to implement.
		return null;
	}

	@Override
	public Book deleteBook(int id) throws DaoException {
		// Not to implement.
		return null;
	}

	@Override
	public void addBook(Book book) throws DaoException {
		// Not to implement.
		
	}

	@Override
	public void updateBook(Book book, int id) throws DaoException {
		// Not to implement.
		
	}

}
