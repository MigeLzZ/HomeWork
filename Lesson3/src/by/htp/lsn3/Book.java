package by.htp.lsn3;

public class Book {
	
	private int pageCount;
	private int publishYear;
	private String title;
	private Author author;
	
	// Конструктор - создаётся для инициализация объекта. Что бы сразу передавать значения.
	public Book(int page, int publish, String title, Author author) {
		pageCount = page;
		publishYear = publish;
		this.title = title;
		this.author = author;
	}
	
	public void getInfo(){
		author.getAuthor();
		System.out.println(pageCount);
		System.out.println(publishYear);
		System.out.println(title);
	}
	
}
