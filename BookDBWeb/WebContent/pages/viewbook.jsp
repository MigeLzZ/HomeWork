<%@page import="java.io.PrintWriter"%>
<%@page import="by.itacademy.catalog.service.impl.SimpleCatalogImpl"%>
<%@page import="by.itacademy.catalog.service.CatalogService"%>
<%@page import="by.itacademy.catalog.domain.entity.Book"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	CatalogService service = new SimpleCatalogImpl();
	Book book = service.getBook(Integer.parseInt(request.getParameter("book_id")));
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><%=book.getTitle()%></title>
</head>
<body>

	<form method='get' action='/BookDBWeb/MainServlet'>
		<input type='hidden' name='command' value='delete_book_action' /> <input
			type='hidden' name='book_id' value='"<%=request.getParameter("book_id")%>"' />
		<%=book%>
		<p></p>
		<input type='submit' formmethod='get' value='Delete' />
	</form>
</body>
</html>