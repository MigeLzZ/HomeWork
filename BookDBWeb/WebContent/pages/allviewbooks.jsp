<%@page import="by.itacademy.catalog.domain.entity.Book"%>
<%@page import="by.itacademy.catalog.service.impl.SimpleCatalogImpl"%>
<%@page import="by.itacademy.catalog.service.CatalogService"%>
<%@page import="by.itacademy.catalog.domain.vo.Catalog"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Books</title>
</head>
<body>
	<h2>View Books</h2>
	<hr>
	<form name='bookid' method='post'
		action='/BookDBWeb/pages/viewbook.jsp'>
		<%
			CatalogService service = new SimpleCatalogImpl();
			Catalog catalog = service.getCatalog();
			for (Book book : catalog.getBooks()) {
				out.println("<p><input type='checkbox' value='" + book.getId() + "' name='book_id' />"
						+ "<a href=\"/BookDBWeb/pages/viewbook.jsp?book_id=" + book.getId() + "\"> " + book.getTitle()
						+ " </a></p>");
			}
		%>
		<p></p>
		<input type='hidden' name='book_id' value='1' /> <input type='submit'
			value='Delete marked' />
	</form>
</body>
</html>