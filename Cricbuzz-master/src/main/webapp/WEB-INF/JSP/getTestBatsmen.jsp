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
        <th colspan="5" style="background-color:#7c2f97;"> Records</th>
    </tr>
      <tr style="background-color:#f0a64e;">
          <th class="border">Player Name</th>
          <th class="border">Country</th>
          <th class="border">Rating</th>
       </tr>
  </thead>                    


  <tbody>  <c:forEach var="testBatsman" items="${testBatsmenList}">                     
          <tr>
              <td>${testBatsman.getPlayerName()}</td>
              <td>${testBatsman.getTestCountry()}</td>
              <td>${testBatsman.getTestRating()}</td>
          </tr>
      </c:forEach>         
   </tbody>
</table>
</body>
</html>