package by.htp.bookstore.dao.impl.STax;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.dao.DaoException;
import by.htp.bookstore.domain.BookElement;
import by.htp.bookstore.domain.entity.Author;
import by.htp.bookstore.domain.entity.Book;
import by.htp.bookstore.domain.entity.BookWithAuthor;

public class BookStaxParser implements BookDao{

	@Override
	public List<Book> readBooks() {
		List<Book> books = new ArrayList<Book>();
		Book book = null;
		Author author = null;
		BookElement currentElement = null;
		XMLStreamReader reader = null;
		try (InputStream input = new FileInputStream("xmldocs/books.xml")) {
			reader = XMLInputFactory.newInstance().createXMLStreamReader(input);
			while (reader.hasNext()) {
				int type = reader.next();
				if (type == XMLStreamConstants.START_ELEMENT) {
					currentElement = BookElement.valueOf(reader.getLocalName().toUpperCase());
					switch (currentElement) {
					case BOOK:
						book = new BookWithAuthor();
						book.setId(Integer.parseInt(reader.getAttributeValue(0).trim()));
						break;
					case AUTHOR:
						author = new Author();
						break;
					}
				} else if (type == XMLStreamConstants.END_ELEMENT) {
					currentElement = BookElement.valueOf(reader.getLocalName().toUpperCase());
					switch (currentElement) {
					case BOOK:
						books.add(book);
						break;
					case AUTHOR:
						((BookWithAuthor) book).addAuthor(author);
						break;
					}
				} else if (type == XMLStreamConstants.CHARACTERS) {
					String s = reader.getText().trim();
					if (s.length() != 0) {
						switch (currentElement) {
						case TITLE:
							book.setTitle(s);
							break;
						case PAGES:
							book.setPageCount(Integer.parseInt(s));
							break;
						case FNAME:
							author.setFname(s);
							break;
						case LNAME:
							author.setLname(s);
							break;
						}
					}
				}
			}
		} catch (XMLStreamException e) {
			e.printStackTrace();
		} catch (FactoryConfigurationError e) {
			e.printStackTrace();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (XMLStreamException e) {
				e.printStackTrace();
			}
		}
		return books;
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
