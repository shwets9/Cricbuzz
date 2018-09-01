<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="com.mongodb.*" %>
<%@page import="java.util.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test_Team</title>
</head>
<body>
<table class="table table-striped table-bordered text-left">
  <thead>
      <tr>
          <th>TEAM NAME</th>
          <th>TEST RATING</th>
          <!-- <th>T20</th>
          <th>Test</th> -->
       </tr>
  </thead>                    


  <tbody>
  <%-- <tr th:each="team : ${teamList}">
  <td th:text="${team.teamName}"></td>
  <td th:text="${team.odiRating}"></td>
  <td th:text="${team.t20Rating}"></td>
  <td th:text="${team.testRating}"></td></tr>
  
  
  <c:forEach items="${users}" var="users">
        <tr>
            <td>${users.getTeamA()}</td>
            <td>${users.getTeamB()}</td>
            <br>
            <td>${users.getScoreA()}</td>
            <td>${users.getScoreB()}</td>
            
            <br>
        </tr>
    </c:forEach> --%>
  
  
      <c:forEach var="team" items="${teamList}">                     
          <tr>
              <td>${team.getTeamName()}</td>
             <td>${team.testRating}</td>
             <%--  <td>${team.t20Rating}</td>
              <td>${team.testRating}</td> --%>
          </tr>
      </c:forEach>        
   </tbody>    
      
                      
  
 

</table>





</body>
</html>