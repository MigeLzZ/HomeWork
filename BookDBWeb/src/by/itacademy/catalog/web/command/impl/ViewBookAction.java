package by.itacademy.catalog.web.command.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademy.catalog.domain.entity.Book;
import by.itacademy.catalog.service.CatalogService;
import by.itacademy.catalog.service.impl.SimpleCatalogImpl;
import by.itacademy.catalog.web.command.BasicAction;

public class ViewBookAction implements BasicAction{

private CatalogService service = new SimpleCatalogImpl();
	
	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		String bookId = request.getParameter("book_id");
		Book book = service.getBook(Integer.parseInt(bookId));
		out.print("<html><head></head><body>"
				+ "<h1><a href='index.html'>Back to menu</a></h1>"
				+ "</body></html>");
		out.println(book);
		return null;
	}

}
