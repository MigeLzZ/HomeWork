package by.htp.lsn3;

public class Main {

	
	public Main(){
		System.out.println("Main constructor.");
	}
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Author a1 = new Author("Peter", "Peter", "Petrovich", "19.05.1890");
		Book b1 = new Book(345, 1999, "Book1", a1);   // —сылка на объект - Book b1.
		b1.getInfo();
		Author a2 = new Author("Vasa", "Vasa", "Vasilich", "15.03.1991");
		Book b2 = new Book(346, 2001, "Book2", a2);
		b2.getInfo();
		//Main m1 = new Main();
	}

}
