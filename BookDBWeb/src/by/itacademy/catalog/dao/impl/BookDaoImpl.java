package by.itacademy.catalog.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.itacademy.catalog.dao.BookDao;
import by.itacademy.catalog.dao.DaoException;
import by.itacademy.catalog.domain.entity.Book;

public class BookDaoImpl implements BookDao{

	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	
	private static final String DB_USER = "root";
	private static final String DB_PASS = "1M2i3g4e5L6";
	private static final String DB_URL = "jdbc:mysql://localhost/bookcatalog?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=False";
	
	private static final String SQL_SELECT_BOOKS = "SELECT * FROM book";
	private static final String SQL_INSERT_BOOK = "INSERT INTO book (title, pages) VALUES (?, ?)";
	private static final String SQL_SELECT_BOOK = "SELECT * FROM book WHERE id = ?";
	private static final String SQL_DELETE_BOOK =  "DELETE FROM book WHERE  id = ?";
	
	@Override
	public List<Book> readBooks() {
		
		List<Book> books = null;
		Connection con = null;
		
		try {
			Class.forName(DB_DRIVER);
			
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(SQL_SELECT_BOOKS);
			
			books = new ArrayList<Book>();
			Book book = null;
			
			while (rs.next()) {
				book = new Book();

				book.setId(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setPages(rs.getInt(3));

				books.add(book);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return books;
	}

	@Override
	public void addBook(Book book) throws DaoException{
		
		Connection con = null;
		PreparedStatement ps = null;

		try {
			Class.forName(DB_DRIVER);

			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			try {
				ps = con.prepareStatement(SQL_INSERT_BOOK);

				ps.setString(1, book.getTitle());
				ps.setInt(2, book.getPages());
				ps.executeUpdate(); 
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}			 
		} catch (ClassNotFoundException e) { 
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public Book getBook(int id) throws DaoException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Book book = null;
		
		try {
			Class.forName(DB_DRIVER);
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			
			ps = con.prepareStatement(SQL_SELECT_BOOK);
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			
			if (rs.next()) {
				book = new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setPages(rs.getInt("pages"));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public void deleteBook(int bookId) {
		
		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName(DB_DRIVER);
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			ps = con.prepareStatement(SQL_DELETE_BOOK);
			ps.setInt(1, bookId);
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
