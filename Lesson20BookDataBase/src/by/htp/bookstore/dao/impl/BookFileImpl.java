package by.htp.bookstore.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.domain.entity.Book;

public class BookFileImpl implements BookDao {

	private static final String FILE_PATH = "c://javalsn//Books.txt";
	
	/*@Override
	public List<Book> readBooks() {
		
		List<Book> books = new ArrayList<Book>();

		books.add(new Book(1, "Book1", 10));
		books.add(new Book(2, "Book2", 15));
		books.add(new Book(3, "Book3", 20));
		
		return books;
	}*/

	// Чтение книжек из файла.
	@SuppressWarnings("unchecked")
	@Override
	public List<Book> readBooks() {

		List<Book> books = new ArrayList<Book>();
		BufferedReader br = null;
		FileReader fr = null;

		try {
			books = (List<Book>) br;
			br = new BufferedReader(new FileReader(FILE_PATH));
			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
		return books;
	}

	@Override
	public Book readBook(int id) {
		//throw new OperationNotSupportedException();
		return null;
	}

	@Override
	public Book deleteBook(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBook(Book book, int id) {
		// TODO Auto-generated method stub
	}
	
}
