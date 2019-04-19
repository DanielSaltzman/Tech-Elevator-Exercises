<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<%-- 
<html>
<head>
 <c:url var="css" value="css/main.css"/> <link rel="stylesheet" href="${css}" />
</head> --%>


<c:forEach var="parks" items="${parks}">

<div class="parkHomePage">


<div class ="parkImg">
<c:url value="parkDetail" var="parkDetailLink" >
		<c:param name="parkcode" value="${parks.parkcode}"/>
		</c:url>
<a href="${parkDetailLink}"><img src="img/parks/${parks.imagecode}.jpg" /> </a>
</div>

<div class="parkInfo">
<h1><c:out value="${parks.parkname}" /></h1>
<p><c:out value="${parks.parkdescription}"/></p> 
<br>
</div>

<br>

</div>
</c:forEach>



<c:import url="/WEB-INF/jsp/common/footer.jsp" />
