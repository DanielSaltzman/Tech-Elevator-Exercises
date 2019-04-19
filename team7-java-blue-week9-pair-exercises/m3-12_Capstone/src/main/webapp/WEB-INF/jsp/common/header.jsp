<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><c:out value="National Park Geek"/></title>
    
 <c:url var="homeUrl" value="/homepage" />
 <c:url var="surveyUrl" value="/survey" /> 
 <c:url var="css" value="css/main.css"/> <link rel="stylesheet" href="${css}" />
  
  <div class="header">
  <div class="logo">
  <img src="img/logo.png" style="
    width: 275px;
    float: left;"/>
  </div>
  <div class="menu">
    <a href="${homeUrl}" class="link">
      <div class="title">Home</div>
      <div class="bar"></div>
    </a>
    <a href="${surveyUrl}" class="link">
      <div class="title">Survey</div>
      <div class="bar"></div>
    </a>
   
  </div>
</div>

