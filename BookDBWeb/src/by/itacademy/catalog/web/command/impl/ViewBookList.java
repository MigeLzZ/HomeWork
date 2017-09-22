package by.itacademy.catalog.web.command.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademy.catalog.domain.entity.Book;
import by.itacademy.catalog.domain.vo.Catalog;
import by.itacademy.catalog.service.CatalogService;
import by.itacademy.catalog.service.impl.SimpleCatalogImpl;
import by.itacademy.catalog.web.command.BasicAction;

public class ViewBookList implements BasicAction{

	private CatalogService service = new SimpleCatalogImpl();
	
	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		Catalog catalog = service.getCatalog();
		out.println("<html><head></head><body>");
		for (Book book: catalog.getBooks()) {
			out.println("<a href='MainServlet?command=view_book_action&book_id=" + book.getId() + "'>" + book.getTitle()
					+ "</a><br>");
		}
		out.println("</body></html>");
		return null;
	}

}
