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

public class DeleteBook implements BasicAction{

	private CatalogService service = new SimpleCatalogImpl();
	
	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		Catalog catalog = service.getCatalog();
		out.println("<html><head><meta charset='utf-8'> <title>View Book</title> </head><body>"
			    + "<form method='get' action='/BookDBWeb/MainServlet' >");
			  
		out.println("<input type=\"hidden\" name=\"command\" value=\"delete_book_action\" />");
		for(Book book : catalog.getBooks()) {
			out.println("<input type='checkbox' value='" + book.getId() + "' name='id' />"
					+ "<a href='MainServlet?command=view_book_action&id=" + book.getId() + "'>" + book.getTitle() + "</a><br>");					
		}
		out.println("<input type='submit' formmethod='get'  value='Delete' />");
		out.println("</form></body></html>");
		return null;
	}

}
