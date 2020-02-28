<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ page  import="model.User"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>korisnicka strana</title>
	<link rel = "stylesheet"
			 type = "text/css"
			href ="../css/style.css"
	/>
</head>
<body>
	<div id = "plavaCrta">
		LOGO
	</div>

	<jsp:useBean id="user" scope="session" class="model.User" ></jsp:useBean>
	
	<h1> Hellooo ${user.userName}</h1>
	
	<h2> BALANCE:  ${user.balance}</h2>
	
	<a href = "../BirajDestinacijuServlet"><button>BIRAJ DESTINACIJU</button></a>
	
	
</body>
</html>