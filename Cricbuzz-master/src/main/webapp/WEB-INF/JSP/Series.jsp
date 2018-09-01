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
          <th>SeriesName</th>
          <th>Teamplaying</th>
          <th>SeriesMatches</th>
          <th>SeriesDate</th>
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