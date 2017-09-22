package by.htp.bookstore.dao.impl.dom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.dao.DaoException;
import by.htp.bookstore.domain.BookElement;
import by.htp.bookstore.domain.entity.Author;
import by.htp.bookstore.domain.entity.Book;
import by.htp.bookstore.domain.entity.BookWithAuthor;

public class BookDomParser implements BookDao{

	private List<Book> books = new ArrayList<Book>();
	private Book book = null;
	private Author author = null;
	private BookElement currentElement = null;
	
	private void parse(NodeList nl) {
		Node currentNode;
		Element current;
		currentNode = nl.item(0);
		while(currentNode != null) {
			if(currentNode.getNodeType() == Node.ELEMENT_NODE) {
				current = (Element)currentNode;				
				currentElement = BookElement.valueOf(current.getTagName().toUpperCase().trim());
				String s = current.getTextContent().trim();
				switch(currentElement) {
				case BOOK:
					book = new BookWithAuthor();
					book.setId(Integer.parseInt(current.getAttribute("id")));						
					parse(current.getChildNodes());
					books.add(book);
					break;
				case TITLE:
					book.setTitle(current.getTextContent());
					break;
				case PAGES:
					book.setPageCount(Integer.parseInt(s));
					break;
				case AUTHOR:
					author = new Author();
					parse(current.getChildNodes());
					((BookWithAuthor)book).addAuthor(author);
					break;
				case FNAME:
					author.setFname(s);
					break;
				case LNAME:
					author.setLname(s);
					break;
				}							
			}			
			currentNode = currentNode.getNextSibling();
		}		
	}
	
	@Override
	public List<Book> readBooks() {
		NodeList nl = null;
		DocumentBuilder db = null;
		Document doc = null;
		try {
			db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			doc = db.parse("xmldocs/books.xml");
			Element root = doc.getDocumentElement();
			nl = root.getChildNodes();
			parse(nl);
			
		} catch (ParserConfigurationException e) {			
			e.printStackTrace();
		} catch (SAXException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
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
