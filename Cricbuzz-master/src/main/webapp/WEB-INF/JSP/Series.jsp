<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="com.mongodb.*" %>
<%@page import="java.util.*" %> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table table-striped table-bordered text-left">
  <thead>
  <tr>
        <th colspan="5" style="background-color:#7c2f97;">Series records</th>
    </tr>
      <tr style="background-color:#f0a64e;">
          <th class="border">SeriesName</th>
          <th class="border">Teamplaying</th>
          <th class="border">SeriesMatches</th>
          <th class="border">SeriesDate</th>
       </tr>
  </thead>                    


  <tbody>  <c:forEach var="s" items="${seriesList}">                     
          <tr>
              <td>${s.getSeriesName()}</td>
             <td>${s.getTeamsPlaying()}</td>
              <td>${s.getSeriesMatches()}</td>
              <td>${s.getSeriesDate()}</td>
          </tr>
      </c:forEach>         
   </tbody>    
   
      
                      
  
 

</table>





</body>
</html>