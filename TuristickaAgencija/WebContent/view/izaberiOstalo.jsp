<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>izaberi ostalo</title>
	<link rel = "stylesheet"
			 type = "text/css"
			href ="../css/style.css"
	/>
</head>
<body>

	<div id = "plavaCrta">
		LOGO
	</div>
	
	<c:set var="idDestinacija" value="${param.id }"/>
	
	<form action="../PraviRacunServlet">
	<input type="hidden" name = "idDestinacija" value="${idDestinacija}">
	Izaberi prevoz:
	<select name="tipPrevoza" >
		<option value = "0"> sopstveni</option>
		<option value = "1"> autobus</option>
		<option value = "2"> voz</option>
		<option value = "3"> avion</option>
	</select>
	Broj osoba: <input type = "text" name="brojOsoba">
	<input type="submit" value="NAPRAVI RACUN">
	
	</form>

</body>
</html>