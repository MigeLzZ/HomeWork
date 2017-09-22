package by.lsn.lsn11work;

public class Book {

	public String title;
	public int pageCount;
	public int yearPublish;
	public String author;
	
	
	public Book() {
		super();
	}
	
	public Book(String title) {
		super();
		this.title = title;
	}
	
	public Book(String title, int pageCount) {
		super();
		this.title = title;
		this.pageCount = pageCount;
	}
	
	public Book(String title, int pageCount, int yearPublish, String author) {
		super();
		this.title = title;
		this.pageCount = pageCount;
		this.yearPublish = yearPublish;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getpageCount() {
		return pageCount;
	}

	public void setpageCount(int count) {
		this.pageCount = count;
	}
	
	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getYearPublish() {
		return yearPublish;
	}

	public void setYearPublish(int yearPublish) {
		this.yearPublish = yearPublish;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
