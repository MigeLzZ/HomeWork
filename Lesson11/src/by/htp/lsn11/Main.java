package by.htp.lsn11;

public class Main {

	public static void main(String[] args) {
		int item = 0;
		
		Book b1 = new Book();
		b1.setName("Бла-бла-бла");
		b1.setAuthor("Василий");
		b1.setYearPublish(1990);
		//System.out.println(b1.getName() + " " + b1.getAuthor() + " " + b1.getYearPublish());
		
		Book b2 = new Book();
		b2.setName("Какая-то книга.");
		b2.setAuthor("Какой-то автор");
		b2.setYearPublish(999);
		//System.out.println(b2.getName() + " " + b2.getAuthor() + " " + b2.getYearPublish());
		
		Book b3 = new Book();
		b3.setName("Самая лучшая книга!");
		b3.setAuthor("Самый лучший автор");
		b3.setYearPublish(2288);
		//System.out.println(b3.getName() + " " + b3.getAuthor() + " " + b3.getYearPublish());
		
		Book b4 = new Book();
		b4.setName("Таксебе книга.");
		b4.setAuthor("Таксебе автор");
		b4.setYearPublish(555);
		//System.out.println(b4.getName() + " " + b4.getAuthor() + " " + b4.getYearPublish());
		
		Book book[] = new Book[4];
		book[0] = b1;
		book[1] = b2;
		book[2] = b3;
		book[3] = b4;
		
		
		Menu m = new Menu();
		m.menuLibrary(item, book);
	}

}
