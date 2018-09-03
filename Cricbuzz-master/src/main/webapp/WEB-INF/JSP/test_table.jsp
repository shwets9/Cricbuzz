<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="com.mongodb.*" %>
<%@page import="java.util.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style >
 /* .navbar {
    overflow: hidden;
    background-color: #00cc6c;
    font-family: Arial, Helvetica, sans-serif;
}
.navbar a {
    float: left;
    font-size: 16px;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}
.dropdown {
    float: left;
    overflow: hidden;
}
.dropdown .dropbtn {
    font-size: 16px;    
    border: none;
    outline: none;
    color: white;
    padding: 14px 16px;
    background-color: inherit;
    font-family: inherit;
    margin: 0;
}
.navbar a:hover, .dropdown:hover .dropbtn {
    background-color: red;
}
.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}
.dropdown-content a {
    float: none;
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}
.dropdown-content a:hover {
    background-color: #ddd;
}
.dropdown:hover .dropdown-content {
    display: block;
}  */
</style>
</head>
<body>
<div class="container">
  <h2>=====================RANKING=======================</h2>
 <div class="navbar">
  <div class="dropdown">
    <button class="dropbtn">ODI 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#" data-toggle="collapse">Batsman</a>
          <a href="#">Bowler</a>
          <a href="#OdiAll"  data-toggle="collapse">All-Rounder</a>
          <a href="#demo" data-toggle="collapse">Team</a>
    
 
</div>
 </div>
  

<div class="dropdown">
    <button class="dropbtn">TEST 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
     <a href="#">Batsman</a>
          <a href="#">Bowler</a>
          <a href="#">All-Rounder</a>
          <a href="#test" data-toggle="collapse">Team</a>
          						
          
          
          
          
          
          
   




</div>
</div>
<div class="dropdown">
    <button class="dropbtn">T20 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
     <a href="#">Batsman</a>
          <a href="#">Bowler</a>
          <a href="#">All-Rounder</a>
          <a href="#t20" data-toggle="collapse">Team</a>
          						
  </div> 

 
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
   <div id="OdiAll" class="collapse">
  <table class="table table-striped table-bordered text-left">
  <thead>
      <tr>
          <th>Player Name</th>
          <th>Country</th>
          <th>Rating</th>
       </tr>
  </thead>                    


  <tbody>  <c:forEach var="odiAllRounder" items="${odiAllRounderList}">                     
          <tr>
          	
              <td>${odiAllRounder.getPlayerName()}</td>
              <td>${odiAllRounder.getOdiCountry()}</td>
              <td>${odiAllRounder.getOdiRating()}</td>
          </tr>
      </c:forEach>         
   </tbody>
</table>
  </div>
   
  
  
  
  </div>

</body>
</html>