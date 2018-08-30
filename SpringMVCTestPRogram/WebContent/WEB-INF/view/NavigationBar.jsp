<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cricbuzz</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
* {
  box-sizing: border-box;
}
.menu {
  float:left;
  width:20%;
  text-align:center;
}
.menu a {
  background-color:#e5e5e5;
  padding:8px;
  margin-top:7px;
  display:block;
  width:100%;
  color:black;
}
.main {
  float:left;
  width:60%;
  padding:0 20px;
}
.right {
  background-color:#e5e5e5;
  float:left;
  width:20%;
  padding:15px;
  margin-top:7px;
  text-align:center;
}



.w3-black,.w3-hover-black:hover{color:#fff!important;background-color:#000!important}
.w3-green,.w3-hover-green:hover{color:#000!important;background-color:#4CAF50!important}
.w3-button{border:none;display:inline-block;outline:0;padding:6px 16px;vertical-align:middle;overflow:hidden;text-decoration:none!important;color:#fff;background-color:#000;text-align:center;cursor:pointer;white-space:nowrap}

.w3-button{color:#fff;background-color:#f1f1f1;padding:6px 16px}.w3-button:hover{color:#fff!important;background-color:#ccc!important}
.w3-button{-webkit-touch-callout:none;-webkit-user-select:none;-khtml-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}   
.w3-button:disabled

.w3-black,.w3-hover-black:hover{color:#fff!important;background-color:#000!important}


.w3-bar{width:100%;overflow:hidden}.w3-center .w3-bar{display:inline-block;width:auto}
.w3-bar .w3-bar-item{padding:6px 16px;float:left;background-color:inherit;color:inherit;width:auto;border:none;outline:none;display:block}
.w3-bar .w3-dropdown-hover,.w3-bar .w3-dropdown-click{position:static;float:left}
.w3-bar .w3-button{background-color:inherit;color:inherit;white-space:normal}
.w3-bar-block .w3-bar-item{width:100%;display:block;padding:6px 16px;text-align:left;background-color:inherit;color:inherit;border:none;outline:none;white-space:normal;float:none}
.w3-bar-block.w3-center .w3-bar-item{text-align:center}
.w3-block{display:block;width:100%}


@media only screen and (max-width:620px) {
  /* For mobile phones: */
  .menu, .main, .right {
    width:100%;
  }
}
</style>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="w3.css">
<body style="font-family:Verdana;color:#aaaaaa;">

<nav class="w3-bar w3-black">
  <a href="" class="w3-button w3-bar-item">Home</a>
  <a href="team.html" class="w3-button w3-bar-item">Teams</a>
  <a href="" class="w3-button w3-bar-item">Series</a>
  <a href="rank.jsp" class="w3-button w3-bar-item">Ranking</a>
</nav>

<div style="overflow:auto">
  <div class="menu">
    <a href="#">Link 1</a>
    <a href="#">Link 2</a>
    <a href="#">Link 3</a>
    <a href="#">Link 4</a>
  </div>

  <div class="main">
    <h2>Main News</h2>
    <p>India ready to tackle Root's men in 4th test.</p>
  </div>

  <div class="right">
    <h2>Photos</h2>
    <p>here we will put the ads and photos</p>
  </div>
</div>

<div style="background-color:#e5e5e5;text-align:center;padding:10px;margin-top:7px;">killers game</div>

</body>
</html>