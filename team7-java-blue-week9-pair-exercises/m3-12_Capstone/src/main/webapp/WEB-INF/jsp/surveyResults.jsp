<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />



<c:forEach var="test" items="${parkSurvey}">

<div class="parkHomePage">


<div class ="parkImg">
<img src="img/parks/${test.imagecode}.jpg" />
</div>

<div class="parkInfo">
<h1><c:out value="${test.parkname}" /></h1>
Was voted for <c:out value="${test.favorited}"/> times.


<br>
</div>

<br>

</div>
</c:forEach>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />
