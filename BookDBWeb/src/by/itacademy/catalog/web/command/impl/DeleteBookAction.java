package by.itacademy.catalog.web.command.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademy.catalog.service.CatalogService;
import by.itacademy.catalog.service.impl.SimpleCatalogImpl;
import by.itacademy.catalog.web.command.BasicAction;

public class DeleteBookAction implements BasicAction{

	private CatalogService service = new SimpleCatalogImpl();
	
	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		//String bookId = request.getParameter("book_id");
		String[] arrId = request.getParameterValues("id");
		out.println("<html><head></head><body>"
				+ "<h1><a href='index.html'>Back to menu</a></h1><br>"
				+ "</body></html>");
		for (String strId: arrId) {
			service.removeBook(Integer.parseInt(strId));
			out.println("the book " + strId + " is deleted");
		}
		return null;
	}

}
