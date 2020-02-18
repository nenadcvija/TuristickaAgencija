<%@page import="java.util.List"%>
<%@page import="model.Destinacija"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transport</title>
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
		List<Destinacija> lista = (List<Destinacija>)request.getAttribute("listaDestinacija");
	
	%>
	
	<!-- ovo je forma za dodavanje transporta -->
	<form action = "DodajTransportServlet" method="get">
		IZABERI DESTINACIJU:
		<select name="destinacija" >
			<% for( Destinacija d: lista){ %>
			<option value="<%=d.getIdDestinacija()%>">
				<%=d.getDrzava() %> / <%=d.getMesto() %>
			</option>
			<%} %>
		</select> <br><br>
		<label >
			SOPSTVENI
			<input type="radio" name="radioDugme" value="sopstveni"> <br><br>
			AVIO
			<input type="radio" name="radioDugme" value="avio"> <br><br>
			BUS
			<input type="radio" name="radioDugme" value="autobus"><br><br>
			VOZ
			<input type="radio" name="radioDugme" value="voz"><br><br>
		</label>
		
		CENA: <input type="text" name="cena" > <br><br>
		POPUST: <input type="text" name="popust" > <br><br>
		<input type="submit" value="UPISI" > 
	
	</form>
	
	
	
	
	

</body>
</html>