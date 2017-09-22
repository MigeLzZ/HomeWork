<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Hello!!</h1>
	<jsp:useBean id="user" class="by.htp.taglibtest.entity.SimpleBean" />
	<jsp:getProperty name="user" property="surname" />
	<jsp:setProperty name="user" property="name" value="Ivan" />
	<jsp:getProperty name="user" property="name"/>
	<jsp:getProperty name="user" property="date"/>
	<jsp:setProperty name="user" property="*" />
	
	<form action="MainServlet" method="GET"> 
		<input type="hidden" name="action" value="login" />
		<input type="text" name="login" />
		<input type="password" name="pass" />
		<input type="submit" value="Login" />
	</form>
</body>
</html>