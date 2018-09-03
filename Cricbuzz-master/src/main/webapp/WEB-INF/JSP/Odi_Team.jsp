<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="com.mongodb.*" %>
<%@page import="java.util.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table table-striped table-bordered text-left">
  <thead>
  <tr>
        <th colspan="5" style="background-color:#7c2f97;"> Records</th>
    </tr>
      <tr style="background-color:#f0a64e;">
          <th class="border">TEAM NAME</th>
          <th class="border">ODI RATING</th>
          <!-- <th>T20</th>
          <th>Test</th> -->
       </tr>
  </thead>                    


  <tbody>
   <c:forEach var="team" items="${teamList}">                     
          <tr>
              <td>${team.getTeamName()}</td>
            
              <td>${team.getOdiRating()}</td>
          </tr>
      </c:forEach>         
 
   </tbody>    
      
                      
  
 

</table>





</body>
</html>