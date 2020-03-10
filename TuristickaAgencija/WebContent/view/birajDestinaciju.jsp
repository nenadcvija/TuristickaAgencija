<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Destinacija" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>dodaj destinaciju</title>
	<link rel = "stylesheet"
			 type = "text/css"
			href ="css/style.css"
	/>
</head>
<body>

	<div id = "plavaCrta">
		LOGO
	</div>
	
	
<!-- 	preuzmi listu iz request objecta -->
<jsp:useBean id="destinacije" scope="request"   type="java.util.List<model.Destinacija>"></jsp:useBean>

<table border="1">
	<tr>
		<th>DRZAVA</th>
		<th>MESTO</th>
		<th>SMESTAJ</th>
		<th>POPUST</th>
		<th>CENA</th>	
		<th>ODABERI</th>	
	</tr>
	<c:forEach var="d" items="${destinacije}">
	<tr>
		<td>${d.drzava}</td>
		<td>${d.mesto}</td>
		<td>${d.smestaj}</td>
		<td>${d.popust}</td>
		<td>${d.cenaSmestaja}</td>
		<td>
				<c:url var = "link" value = "/view/izaberiOstalo.jsp"   > 
						<c:param  name = "id" value = "${d.idDestinacija}"/>
				 </c:url>
					<a href = "${link}" > izaberi </a> 	  
		</td>
	</tr>
	</c:forEach>

</table>




</body>
</html>