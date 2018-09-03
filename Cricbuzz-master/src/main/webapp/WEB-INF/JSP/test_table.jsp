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
      <a href="#OdiBat" data-toggle="collapse">Batsman</a>
          <a href="#OdiBowl" data-toggle="collapse">Bowler</a>
          <a href="#OdiAll"  data-toggle="collapse">All-Rounder</a>
          <a href="#OdiTeam" data-toggle="collapse">Team</a>
    
 
</div>
 </div>
  

<div class="dropdown">
    <button class="dropbtn">TEST 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
     <a href="#TestBat" data-toggle="collapse">Batsman</a>
          <a href="#TestBowl" data-toggle="collapse">Bowler</a>
          <a href="#TestAll" data-toggle="collapse">All-Rounder</a>
          <a href="#TestTeam" data-toggle="collapse">Team</a>
</div>
</div>
<div class="dropdown">
    <button class="dropbtn">T20 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
     <a href="#T20Bat" data-toggle="collapse">Batsman</a>
          <a href="#T20Bowl" data-toggle="collapse">Bowler</a>
          <a href="#T20All" data-toggle="collapse">All-Rounder</a>
          <a href="#T20Team" data-toggle="collapse">Team</a>
          						
  </div> 

 
</div>


</div>

 <div id="OdiTeam" class="collapse">
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
<div id="TestTeam" class="collapse">
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
<div id="T20Team" class="collapse">
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
  
  
  <div id="OdiBowl" class="collapse">
  <table class="table table-striped table-bordered text-left">
  <thead>
      <tr>
          <th>Player Name</th>
          <th>Country</th>
          <th>Rating</th>
       </tr>
  </thead>                    


  <tbody>  <c:forEach var="odiBowlers" items="${odiBowlersList}">                     
          <tr>
          	
              <td>${odiBowlers.getPlayerName()}</td>
              <td>${odiBowlers.getOdiCountry()}</td>
              <td>${odiBowlers.getOdiRating()}</td>
          </tr>
      </c:forEach>         
   </tbody>
</table>
  </div>
   
  
  <div id="OdiBat" class="collapse">
  <table class="table table-striped table-bordered text-left">
  <thead>
      <tr>
          <th>Player Name</th>
          <th>Country</th>
          <th>Rating</th>
       </tr>
  </thead>                    


  <tbody>  <c:forEach var="odiBatsmen" items="${odiBatsmenList}">                     
          <tr>
          	
              <td>${odiBatsmen.getPlayerName()}</td>
              <td>${odiBatsmen.getOdiCountry()}</td>
              <td>${odiBatsmen.getOdiRating()}</td>
          </tr>
      </c:forEach>         
   </tbody>
</table>
  </div>
  
  <div id="TestBat" class="collapse">
  <table class="table table-striped table-bordered text-left">
  <thead>
      <tr>
          <th>Player Name</th>
          <th>Country</th>
          <th>Rating</th>
       </tr>
  </thead>                    


  <tbody>  <c:forEach var="testBatsmen" items="${testBatsmenList}">                     
          <tr>
          	
              <td>${testBatsmen.getPlayerName()}</td>
              <td>${testBatsmen.getTestCountry()}</td>
              <td>${testBatsmen.getTestRating()}</td>
          </tr>
      </c:forEach>         
   </tbody>
</table>
  </div>
  
  <div id="TestBowl" class="collapse">
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
  </div>
  
  <div id="TestAll" class="collapse">
  <table class="table table-striped table-bordered text-left">
  <thead>
      <tr>
          <th>Player Name</th>
          <th>Country</th>
          <th>Rating</th>
       </tr>
  </thead>                    


  <tbody>  <c:forEach var="testAllRounder" items="${testAllRounderList}">                     
          <tr>
          	
              <td>${testAllRounder.getPlayerName()}</td>
              <td>${testAllRounder.getTestCountry()}</td>
              <td>${testAllRounder.getTestRating()}</td>
          </tr>
      </c:forEach>         
   </tbody>
</table>
  </div>
  
  <div id="T20Bat" class="collapse">
  <table class="table table-striped table-bordered text-left">
  <thead>
      <tr>
          <th>Player Name</th>
          <th>Country</th>
          <th>Rating</th>
       </tr>
  </thead>                    


  <tbody>  <c:forEach var="t20Batsmen" items="${t20BatsmenList}">                     
          <tr>
          	
              <td>${t20Batsmen.getPlayerName()}</td>
              <td>${t20Batsmen.getT20Country()}</td>
              <td>${t20Batsmen.getT20Rating()}</td>
          </tr>
      </c:forEach>         
   </tbody>
</table>
  </div>
  
  <div id="T20Bowl" class="collapse">
  <table class="table table-striped table-bordered text-left">
  <thead>
      <tr>
          <th>Player Name</th>
          <th>Country</th>
          <th>Rating</th>
       </tr>
  </thead>                    


  <tbody>  <c:forEach var="t20Bowlers" items="${t20BowlersList}">                     
          <tr>
          	
              <td>${t20Bowlers.getPlayerName()}</td>
              <td>${t20Bowlers.getT20Country()}</td>
              <td>${t20Bowlers.getT20Rating()}</td>
          </tr>
      </c:forEach>         
   </tbody>
</table>
  </div>
  
  <div id="T20All" class="collapse">
  <table class="table table-striped table-bordered text-left">
  <thead>
      <tr>
          <th>Player Name</th>
          <th>Country</th>
          <th>Rating</th>
       </tr>
  </thead>                    


  <tbody>  <c:forEach var="t20AllRounder" items="${t20AllRounderList}">                     
          <tr>
          	
              <td>${t20AllRounder.getPlayerName()}</td>
              <td>${t20AllRounder.getT20Country()}</td>
              <td>${t20AllRounder.getT20Rating()}</td>
          </tr>
      </c:forEach>         
   </tbody>
</table>
  </div>
  
  </div>

</body>
</html>