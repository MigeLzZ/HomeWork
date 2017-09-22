package by.htp.bookstore.dao.impl.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import by.htp.bookstore.domain.BookElement;
import by.htp.bookstore.domain.entity.Author;
import by.htp.bookstore.domain.entity.Book;
import by.htp.bookstore.domain.entity.BookWithAuthor;

public class BookHandler extends DefaultHandler{

	private List<Book> books = new ArrayList<Book>();
	private Book book = null;
	private Author author = null;
	private BookElement currentElement = null;
	
	public List<Book> getBooks() {
		return books;
	}
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("SAX parser found root element!");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("SAX parser has finished");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		currentElement = BookElement.valueOf(qName.toUpperCase().trim());
		switch(currentElement){
		case BOOK:
			book = new BookWithAuthor();
			book.setId(Integer.parseInt(attributes.getValue(0)));
			//System.out.println("Found Book:" + qName);
			break;
		case AUTHOR:
			author = new Author();
			break;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		currentElement = BookElement.valueOf(qName.toUpperCase().trim());
		switch(currentElement){
			case BOOK:
				books.add(book);
				break;
			case AUTHOR:
				((BookWithAuthor) book).addAuthor(author);
				break;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String s = new String(ch, start, length).trim();		
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
