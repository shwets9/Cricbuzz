<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="com.mongodb.*" %>
<%@page import="java.util.*" %> 
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table table-striped table-bordered text-left">
  <thead>
      <tr>
          <th>Player Name</th>
          <th>Country</th>
          <th>Rating</th>
       </tr>
  </thead>                    


  <tbody>  <c:forEach var="testBowlers" items="${testBowlersList}">                     
          <tr>
              <td>${testBowlers.getPlayerName()}</td>
              <td>${testBowlers.getTestCountry()}</td>
              <td>${testBowlers.getTestRating()}</td>
          </tr>
      </c:forEach>         
   </tbody>
</table>
</body>
</html>