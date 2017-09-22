package by.htp.lsn12.entity;

public class Catalog {

	private static final int STANDART_SIZE = 10;
	
	private Book[] books;
	public int bookCount;

	public Catalog() {  // Конструктор - особый вид метода, который вызывается в момент создания объекта автоматически и т.д.
		books = new Book[STANDART_SIZE];
	}
	
	public Catalog(int defaultSize) {
		if (defaultSize > 0) {
			books = new Book[defaultSize];
		} else {
			books = new Book[STANDART_SIZE];
		}
	}
	
	public void addBook(Book book) {
		if (book != null) {
			books[bookCount] = book;
			bookCount++;
		}
	}

}
