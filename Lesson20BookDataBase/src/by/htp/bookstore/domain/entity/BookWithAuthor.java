package by.htp.bookstore.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class BookWithAuthor extends Book{
	private List<Author> authors = new ArrayList();
	
	public BookWithAuthor() {		
		super();		
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void addAuthor(Author author) {
		authors.add(author);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookWithAuthor other = (BookWithAuthor) obj;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String s = super.toString() + ", Authors: ";
		for (int i = 0; i < authors.size(); i++) {
			s += authors.get(i);
			if(authors.size() - i != 1) {
				s += ", ";
			}
			
		}
		return s;
	}

	
}
