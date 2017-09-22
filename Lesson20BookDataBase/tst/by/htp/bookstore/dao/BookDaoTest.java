package by.htp.bookstore.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import by.htp.bookstore.dao.impl.BookMySQLImpl;
import by.htp.bookstore.dao.impl.sax.BookSaxParser;
import by.htp.bookstore.domain.entity.Book;

public class BookDaoTest {
	
	//private static BookDao dao;
	private static BookDao dao;
	
	@BeforeClass
	public static void initTestData() {
		dao = new BookSaxParser();
		//dao = new BookMySQLImpl();
	}
	
	@Test
	public void testReadBooksNullList() {
		List<Book> book = dao.readBooks();
		assertNotNull(book);
	}

	@Test
	public void testReadBooksEmptyList() {
		List<Book> book = dao.readBooks();
		assertTrue(book.size() > 0);
	}
}
