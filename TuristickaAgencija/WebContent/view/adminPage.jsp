<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.User"%>
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

	<%
		User user = (User)session.getAttribute("userIzBaze");
	%>

	<h1> Hellooo   <%=user.getUserName() %></h1>
	
	
	<%
		int x = 6;
	    int y = 7;
	    int zbir = x+y;
	
	%>
	
	<p>Moj omiljeni zbir brojeva je: <%=zbir %></p> 
	
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
		
		<%	for(int i = 0; i<=zbir;i++){ %>
			<tr>
				<td><%=i %></td>
				<td><%=zbir-i %></td>
			</tr>
		<%} %>	
	</table>
	
	<a href = "../SviUseriServlet"> 
		<img src="../slike/globus.jpg">
	</a>
	
	
	
	
	
	
	
	
	

</body>
</html>