<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>rank</title>

<style>
.navbar {
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


.subnav {
  float: left;
  overflow: hidden;
}

/* Subnav button */
.subnav .subnavbtn {
  font-size: 16px; 
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}


/* When you move the mouse over the subnav container, open the subnav content */
.subnav:hover .subnav-content {
  display: block;
}


.subnav-content {
    display: none;
    position: absolute;
    left: 0;
    background-color:#00cc6c;
    width: 100%;
    z-index: 1;
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
}
</style>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<body>



<div class="navbar">
  <a href="#home">Home</a>
 
 <div class="subnav">
<button class="subnavbtn">Ranking <i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <div class="dropdown">
    <button class="dropbtn">ODI 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">Batsman</a>
          <a href="#">Bowler</a>
          <a href="#">All-Rounder</a>
          <a href="Odi_Team">Team</a>
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
          <a href="Test_Team">Team</a>
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
          <a href="T20_Team">Team</a>
    </div>
  </div> 
     


</body>
</html>