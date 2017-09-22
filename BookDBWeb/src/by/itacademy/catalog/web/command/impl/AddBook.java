package by.itacademy.catalog.web.command.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademy.catalog.domain.entity.Book;
import by.itacademy.catalog.service.CatalogService;
import by.itacademy.catalog.service.impl.SimpleCatalogImpl;
import by.itacademy.catalog.web.command.BasicAction;

public class AddBook implements BasicAction{

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><head></head><body>"
				+ "<form action='MainServlet' method='GET'> "
				+ "<input type='text' name='book_id'/>"
				+ "<input type='text' name='book_title'/>"
				+ "<input type='text' name='book_pages'/>"
				+ "<input type='hidden' name='command' value='add_book_action'/>"
				+ "<input type='submit' value='add'/>"
				+ "</form>"
				+ "</body></html>");
		return null;
	}

}
