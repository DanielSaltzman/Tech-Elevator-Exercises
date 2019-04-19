<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />


<div id="parkDetails">
<p>${park.parkname} was founded in the year ${park.yearfounded} has ${park.annualvisitorcount} 
annual visitors.
</p>
</div>

		
<img src="img/parks/${park.imagecode}.jpg" /><br><br>
<p>${park.parkdescription}</p>
<ul class = "parkDetailSummary">
		<li>Cost of Entry: $${park.entryfee} Dollars</li>
		<li>State of Park: ${park.state} </li>
		<li>Park Acreage: ${park.acreage}</li>
		<li>Park Elevation: ${park.elevationinfeet} Feet </li>
		<li>Miles of trail: ${park.milesoftrail}</li>
		<li>Number of camp sites: ${park.numberofcampsites} </li>
		<li>Type of Climate: ${park.climate} </li>
		<li>Number of animal Species: ${park.numberofanimalspecies}</li>
</ul>
<p>What the well regarded ${park.inspirationalquotesource} said when it comes to ${park.parkname}. </p>
"${park.inspirationalquote}"
<br><br>
<c:forEach var="weather" items="${weather}">
<div class="container">

<div class="weatherForecast">
		<div id="dailyImg">
		<c:out value="${weather.fivedayforecastvalue}" /><br>
		<c:choose>
			  <c:when test = "${weather.forecast == 'rain'}" >
			    <img src="img/weather/rain.png"/>
			  </c:when>
			  <c:when test = "${weather.forecast == 'snow'}">
			    <img src="img/weather/snow.png"/>
			  </c:when>
			 <c:when test = "${weather.forecast == 'thunderstorms'}">
			    <img src="img/weather/thunderstorms.png"/>
			  </c:when>
			  
			 <c:when test = "${weather.forecast == 'sunny'}">
			    <img src="img/weather/sunny.png"/>
			  </c:when>
			
			<c:when test = "${weather.forecast == 'partly cloudy'}">
			    <img src="img/weather/partlyCloudy.png"/>
			  </c:when>
			  
			  <c:when test = "${weather.forecast == 'cloudy'}">
			    <img src="img/weather/cloudy.png"/>
			  </c:when>
			</c:choose><br>
			</div>
			  <div class="overlay">
			<div class="text">
		<div id="dailyInfo">
				<c:out value="${weather.forecast}" /> is expected, 
		
		<c:choose>
			  <c:when test = "${weather.forecast == 'rain'}" >
			    <c:out value = "You should bring rain gear and waterproof shoes."/>
			  </c:when>
			  <c:when test = "${weather.forecast == 'snow'}">
				<c:out value = "You should bring snowshoes."/>		
			  </c:when>
			 <c:when test = "${weather.forecast == 'thunderstorms'}">
			   <c:out value = "Please seek shelter and avoid hiking on exposed ridges."/>
			  </c:when>
			  
			 <c:when test = "${weather.forecast == 'sunny'}">
			    <c:out value = "Please use sunblock."/>
			  </c:when>
			
			</c:choose><br>
			
		<c:out value="The days low temperature will be" /> <c:out value="${weather.low}"/> F.  
		<c:choose>
			<c:when test = "${weather.low < 20}">
			<c:out value = " Please take caution as the weather will be frigid today."/>
			</c:when>
		</c:choose>
		<br> 
		
		<c:out value="The days high temperature will be" /> <c:out value="${weather.high}"/> F. 
		<c:choose>
			<c:when test = "${weather.high > 75}">
			<c:out value = "Please bring an extra gallon of water to remain hydrated."/>
			</c:when>
		</c:choose>
		<br> 
		<c:choose>
			<c:when test = "${weather.high - weather.low > 20}">
			<c:out value = "Please wear breathable layers."/><br>
			</c:when>
		</c:choose> <br>
		</div>
		 </div>
    
  </div>
<br>
</div>
</div>

</c:forEach>
<br>




				
				


