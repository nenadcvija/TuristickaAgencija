<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import="model.Racun" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>racun</title>
</head>
<body>

<!-- 	preuzmi racun iz servleta -->
<jsp:useBean id="racun" scope="request"   class = "model.Racun"></jsp:useBean>
RACUN!<br><br>
USER: ${racun.user.userName }<br><br>
SMESTAJ: ${racun.cenaSmestaja }<br><br>
TRANSPORT: ${racun.cenaTransporta }<br><br>
TOTAL: ${racun.total }

</body>
</html>