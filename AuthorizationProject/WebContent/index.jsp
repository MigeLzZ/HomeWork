<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<br>
	<h2>Authorization:</h2>
	<form action="MainServlet" method="get">
		<input type="hidden" name="command" value="login" />
		<input type="text" name="name" /> 
		<input type="password" name="pass" /> 
		<input type="submit" name="log in" />
	</form>
</body>
</html>