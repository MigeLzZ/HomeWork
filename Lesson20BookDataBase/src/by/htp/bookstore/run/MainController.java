package by.htp.bookstore.run;

import by.htp.bookstore.domain.entity.Book;
import by.htp.bookstore.domain.vo.Catalog;
import by.htp.bookstore.service.BookService;
import by.htp.bookstore.service.impl.BookServiceImpl;
import by.htp.bookstore.view.SimpleUserOutputter;
import by.htp.bookstore.view.impl.ConsoleOutput;

// Реализовать метод удаления книжки по id.
// Создать метод позволяющий отредактировать книжку по названию.
// После выполнения методов выполнить обновлённый каталог.
// Прочитать приложение №4 (из Блинова).
// Сайт sql-ex.ru делать задачки.
// quizful.net, codewars, robocode

public class MainController {

	public static void main(String[] args) {
		
		BookService bookService = new BookServiceImpl("SAX");
		//BookService bookService = new BookServiceImpl("StAX");
		//BookService bookService = new BookServiceImpl("DOM");		
		//SimpleUserOutputter outputter = new FileOutput();
		SimpleUserOutputter outputter = new ConsoleOutput();
		Catalog catalog = bookService.getBookCatalog();
		outputter.printBookCatalog(catalog);
		
		/*BookService bookService = new BookServiceImpl();
		SimpleUserOutputter outputter = new ConsoleOutput();
		
		//Catalog catalog = bookService.getBookCatalog();
		//outputter.printBookCatalog(catalog);
		
		Book book = new Book(7, "Book123", 123);
		bookService.addNewBook(book);
		
		System.out.println("Catalog after: ");
		
		//catalog = bookService.getBookCatalog();
		//outputter.printBookCatalog(catalog);
		
		Book newBook = bookService.getBook(11);
		bookService.delBook(11);
		
		//System.out.println(newBook);
		
		//catalog = bookService.getBookCatalog();
		//outputter.printBookCatalog(catalog);
		
		Book book1 = new Book(5, "BookBook", 777);
		bookService.updateBook(book1, 25);
		
		Catalog catalog = bookService.getBookCatalog();
		outputter.printBookCatalog(catalog); */
	}

}
