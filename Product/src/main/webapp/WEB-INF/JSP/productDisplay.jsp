<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.*" %> 
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
<table border="1">
 	<tr><c:out value="${product.productId}" /></tr>
    <tr><c:out value="${product.productName}" /></tr>
    <tr><c:out value="${product.productDescription}" /></tr>
    <tr><c:out value="${product.productCost}" /></tr>
    

</table>
   
    <img src="data:image/jpg;base64,${product.productImage}" width="240" height="300"/>
</div>
</body>
</html>

