<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="foxmindedinstrumentariy.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>First java server page</title>
</head>
	<body>
		<h1>Hello world</h1>
		
		<h2>My java server page</h2>
		<br/>
		
		<%
			for(String name : DatabaseFacade.getBooks()){
				out.println(name + "<br/>");
			}
			
			
		%>
		
	</body>
</html>