<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>

.nav li a:first-child:nth-last-child(2):before { 
  content: ""; 
  position: absolute; 
  height: 0; 
  width: 0; 
  border: 5px solid transparent; 
  top: 50% ;
  right:5px;  
 }

nav {    
  display: block;
  text-align: center;
}
nav ul {
  margin: 0;
  padding:0;
  list-style: none;
}
.nav a {
  display:block; 
  background: #111; 
  color: #fff; 
  text-decoration: none;
  padding: 0.8em 1.8em;
  text-transform: uppercase;
  font-size: 80%;
  letter-spacing: 2px;
  text-shadow: 0 -1px 0 #000;
  position: relative;
}
.nav{  
  vertical-align: top; 
  display: inline-block;
  box-shadow: 
    1px -1px -1px 1px #000, 
    -1px 1px -1px 1px #fff, 
    0 0 6px 3px #fff;
  border-radius:6px;
}
.nav li {
  position: relative;
}
.nav > li { 
  float: left; 
  border-bottom: 4px #aaa solid; 
  margin-right: 1px; 
} 
.nav > li > a { 
  margin-bottom: 1px;
  box-shadow: inset 0 2em .33em -0.5em #555; 
}
.nav > li:hover, 
.nav > li:hover > a { 
  border-bottom-color: orange;
}
.nav li:hover > a { 
  color:orange; 
}
.nav > li:first-child { 
  border-radius: 4px 0 0 4px;
} 
.nav > li:first-child > a { 
  border-radius: 4px 0 0 0;
}
.nav > li:last-child { 
  border-radius: 0 0 4px 0; 
  margin-right: 0;
} 
.nav > li:last-child > a { 
  border-radius: 0 4px 0 0;
}
.nav li li a { 
  margin-top: 1px;
}

</style>


</head>
<body>
<nav>
  <ul class="nav">
  
    <li><a href="#">ODI</a>
      <ul>
        <li><a href="#">Batsman</a></li>
        <li><a href="#">Bowler</a></li>
        <li><a href="#">All-Rounder</a></li>
        <li><a href="#">Team</a></li>
      </ul>
    </li>
    <li><a href="#">TEST</a>
      <ul>
        <li><a href="#">Batsman</a></li>
        <li><a href="#">Bowler</a></li>
        <li><a href="#">All-Rounder</a></li>
        <li><a href="#">Team</a></li>
      </ul>
    </li>
    <li><a href="#">T20</a>
      <ul>
        <li><a href="#">Batsman</a></li>
        <li><a href="#">Bowler</a></li>
        <li><a href="#">All-Rounder</a></li>
        <li><a href="#">Team</a></li>
      </ul>
    </li>

  </ul>
</nav>
</body>
</html>