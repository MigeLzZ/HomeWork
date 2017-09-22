package by.htp.lsn18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {  // Сделать реализацию связанного списка. 
		                                      // Методы: Добавление элемента в конец, получение, вставка в середину, удаление элемента (*) в списке (последнего).
		
		List objects = new ArrayList();
		//objects.add(new Object());
		objects.add(new Book());
		
		for (int i = 0; i < objects.size(); i++) {
			Book book = (Book)objects.get(i);
			String title = book.getTitle();
			//System.out.println(title);
		}
		
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("one"));
		books.add(new Book("two"));
		books.add(new Book("four"));
		
		books.add(2, new Book("three"));
		//books.set(2, new Book("three"));
		
		for (int i = 0; i < books.size(); i++) {
			//System.out.println(books.get(i).getTitle());
		}
		
		LinkedList<Book> linkedBooks = new LinkedList<Book>();
		linkedBooks.add(new Book("one"));
		linkedBooks.add(new Book("two"));
		linkedBooks.add(new Book("three"));
		// Способы перебрать элементы.
		for (int i = 0; i < linkedBooks.size(); i++) {
			//System.out.println(linkedBooks.get(i).getTitle());
		}
		
		for (Book book: linkedBooks) {
			//System.out.println(book.getTitle());
		}
		
		Iterator<Book> it = linkedBooks.iterator();
		while (it.hasNext()) {
			String title = it.next().getTitle();
			
			if ("two".equals(title)) {
				it.remove();
			}
				
			//System.out.println(it.next().getTitle());
		}	
		
		for (Book book: linkedBooks) {
			//System.out.println(book.getTitle());
		}
		
		Set<Book> setBooks = new HashSet<Book>();
		setBooks.add(new Book("one"));
		setBooks.add(new Book("two"));
		setBooks.add(new Book("three"));
		setBooks.add(new Book("two"));
		
		for (Book book: setBooks) {
			//System.out.println(book.getTitle());
		}
		
		Book b1 = new Book("one");
		Book b2 = new Book("two");
		Book b3 = new Book("three");
		Book b4 = new Book("two");
	
		System.out.println(b1.hashCode() + " " + b2.hashCode() + " " + b3.hashCode() + " " + b4.hashCode());
		Map<Book, Integer> mapBooks = new HashMap<Book, Integer>();
		mapBooks.put(b1, 100);
		mapBooks.put(b2, 200);
		mapBooks.put(b3, 300);
		mapBooks.put(b4, 400);      // Ключ не добавится, а старое значение перезапишется и потеряется.
		
		for(Entry<Book, Integer> key: mapBooks.entrySet()) {
			
			System.out.println(key.getKey().getTitle() + key.getKey().hashCode());
			System.out.println(key.getValue());
			
		}
	}

}

class Book {
	private String title;
	
	public String getTitle() {
		return title;
	}
	
	public Book() {
		
	}
	
	public Book(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
}
class ChildBook extends Book {
	
}