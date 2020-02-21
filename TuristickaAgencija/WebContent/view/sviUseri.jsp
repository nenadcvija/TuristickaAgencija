<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="model.User" %>
 <%@ page import="java.util.List" %>
 <%@ page import="java.util.ArrayList" %>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>all users</title>
	<link rel = "stylesheet"
			 type = "text/css"
			href ="../css/style.css"
	/>
</head>
<body>
	<div id = "plavaCrta">
		LOGO
	</div>
		
		<a href = "adminPage.jsp"> back to admin page</a>
		
		<%
			List<User> useri = new ArrayList<User>();
			
			useri = (List<User>)session.getAttribute("useriIzBaze");
		
		%>
		
		<jsp:useBean id="useriIzBaze" scope="session" class="java.util.ArrayList"  ></jsp:useBean>
		
		<c:set var="useri" value="${useriIzBaze}"/>
		
		
		<h1> TABELA SVIH USERA </h1>
		
			<table border="1">
				<tr>
					<th>ID</th>
					<th>USER NAME</th>
					<th>PASSWORD</th>
					<th>BALANCE</th>
					<th>ROLA</th>
					<th>ADD BALANCE</th>		
				</tr> 
		<c:forEach var ="u" items="${useri}">
			<tr>
				<td>${u.idUser}</td>
				<td>${u.userName}</td>
				<td>${u.password}</td>
				<td>${u.balance}</td>
				<td>${u.rola}</td>
				<td>
						<c:url var = "link" value = "/view/dodajBalance.jsp"   > 
								<c:param  name = "index" value = "${u.idUser}"/>
					    </c:url>
						<a href = "${link}" > dodaj </a> 	  
				</td>
			</tr>
		</c:forEach>
	</table>
		
		
		
		
		
		


</body>
</html>