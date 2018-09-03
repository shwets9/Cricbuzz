<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="com.mongodb.*" %>
<%@page import="java.util.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h1>RANKING</h1>
 
    <div class="btn-group">
      <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
     ======= ODI ======
      </button>
      <div class="dropdown-menu">
        <a class="dropdown-item"  href="#demo" data-toggle="collapse">Team</a>
        <a class="dropdown-item" href="#">Smartphone</a>
      </div>
      
      <br><br>
      
       <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
      =======T20========
      </button>
      <div class="dropdown-menu">
        <a class="dropdown-item"  href="#t20" data-toggle="collapse">Team</a>
        <a class="dropdown-item" href="#">Smartphone</a>
      </div>
      
      <br><br>
      
      
       <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
      =========Test========
      </button>
      <div class="dropdown-menu">
        <a class="dropdown-item"  href="#test" data-toggle="collapse">Team</a>
        <a class="dropdown-item" href="#">Smartphone</a>
      </div>
    </div>
  
  
  
   <div id="demo" class="collapse">
   <table class="table table-striped table-bordered text-left">
  <thead>
      <tr>
          <th>TEAM NAME</th>
          <th>ODI RATING</th>
          <!-- <th>T20</th>
          <th>Test</th> -->
       </tr>
  </thead>                    


  <tbody>
  
  
   <c:forEach var="team" items="${teamList}">                     
          <tr>
              <td>${team.getTeamName()}</td>
             <td>${team.odiRating}</td>
             <%--  <td>${team.t20Rating}</td>
              <td>${team.testRating}</td> --%>
          </tr>
      </c:forEach>        
   </tbody>    
      </table>
                      


  </div>
<div id="test" class="collapse">
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
  </div>
<div id="t20" class="collapse">
   <table class="table table-striped table-bordered text-left">
  <thead>
      <tr>
          <th>TEAM NAME</th>
          <th>T20 RATING</th>
          <!-- <th>T20</th>
          <th>Test</th> -->
       </tr>
  </thead>                    


  <tbody>
  
  
   <c:forEach var="team" items="${teamList}">                     
          <tr>
              <td>${team.getTeamName()}</td>
             <td>${team.t20Rating}</td>
             <%--  <td>${team.t20Rating}</td>
              <td>${team.testRating}</td> --%>
          </tr>
      </c:forEach>        
   </tbody>    
      
        </table>              


  </div>
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  </div>

</body>
</html>