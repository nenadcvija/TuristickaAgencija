<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.User"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>adminova strana</title>
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

	<h1> Hellooo   ${user.userName} </h1>
	
	
	<%
		int x = 6;
	    int y = 7;
	    int zbir = x+y;
	
	%>
	<c:set var="x" value="6"/>
	<c:set var="y" value="7"/>
	<c:set var="zbir" value= "${x+y}"  />
	
	<p>Moj omiljeni zbir brojeva je:${zbir }</p> 
	
	<% 
		if(zbir<5){
	%>
	
		<p> Nista!</p>
	
	<% 
	}else{
	%>
		<p> ok!</p>
	<% 	
	}
	%>
	
	
	<table border="1">
		<tr>
			<th>BROJ</th>
			<th>NESTO</th>
		</tr> 
		
		<c:forEach  var ="i" begin="0" end="${zbir}" >
			<tr>
				<td>${i}</td>
				<td>${zbir-i }</td>
			</tr>
		</c:forEach>

	</table>
	<div >
	<a href = "../SviUseriServlet"> 
		<img src="../slike/globus.jpg">
	</a>
	</div>
	<br>
	<br>
	<br>
	<div>
	<a href = "dodajDestinaciju.jsp"> 
		<button >DODAJ DESTINACIJU</button>
	</a>
	
		<a href = "../ListaDestinacijaServlet"> 
		<button >DODAJ TRANSPORT</button>
	</a>
	</div>
	
	
	
	
	
	
	

</body>
</html>