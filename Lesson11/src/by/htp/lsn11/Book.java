package by.htp.lsn11;

public class Book {

	private int yearPublish;
	private String author;
	private String name;
	
	public void Book(int yearPublish, String author, String name) {
		this.yearPublish = yearPublish;
		this.author = author;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
