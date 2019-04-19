<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.Date" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />






<div id="parkDetails">
	<h1>${park.parkname} </h1> ${park.parkdescription}


	<div class="containerForParkDetail">

	<img src="img/parks/${park.imagecode}.jpg" class="imageForParkDetail"/> 
	 <div class="overlayForParkDetail">
	<br>
	<br>
	<div class="textForParkDetail">
	<ul class="parkDetailSummary">
		<li>Cost of Entry: $${park.entryfee} Dollars</li>
		<li>State of Park: ${park.state}</li>
		<li>Year of Opening: ${park.yearfounded} </li>
		<li>Park Acreage: ${park.acreage}</li>
		<li>Park Elevation: ${park.elevationinfeet} Feet</li>
		<li>Miles of Trail: ${park.milesoftrail}</li>
		<li>Number of Camp Sites: ${park.numberofcampsites}</li>
		<li>Type of Climate: ${park.climate}</li>
		<li>Number of animal species: ${park.numberofanimalspecies}</li>
		<li>Annual number of visitors: ${park.annualvisitorcount}</li>
	</ul>
	<p>What the well regarded ${park.inspirationalquotesource} said
		when it comes to ${park.parkname}.</p>
	"${park.inspirationalquote}" <br></div>
	</div>
</div>
	

	<br>
	
	
	<c:forEach var="weather" items="${weather}">
		<div class="weatherForecast">
			<div class="container">

				<div id="dailyImg">
				<jsp:useBean id="ourDate" class="java.util.Date"/>
				<jsp:setProperty name="ourDate" property="time" value="${ourDate.time + 86400000}"/>
				<fmt:formatDate value="${ourDate}" pattern="E"/>
				
					<br>
					<c:choose>
						<c:when test="${weather.forecast == 'rain'}">
							<img src="img/weather/rain.png" />
						</c:when>
						<c:when test="${weather.forecast == 'snow'}">
							<img src="img/weather/snow.png" />
						</c:when>
						<c:when test="${weather.forecast == 'thunderstorms'}">
							<img src="img/weather/thunderstorms.png" />
						</c:when>

						<c:when test="${weather.forecast == 'sunny'}">
							<img src="img/weather/sunny.png" />
						</c:when>

						<c:when test="${weather.forecast == 'partly cloudy'}">
							<img src="img/weather/partlyCloudy.png" />
						</c:when>

						<c:when test="${weather.forecast == 'cloudy'}">
							<img src="img/weather/cloudy.png" />
						</c:when>

					</c:choose>
					<div class="overlay">
						<br>
					</div>
					<div class="overlay">
						<div id="dailyInfo">
							<%-- <c:out value="${weather.forecast}" />  
		 --%>






							<c:out value="Low temperature " />
						
							<c:choose>
								<c:when test="${temperature == 'celsius'}">
									<fmt:formatNumber type="number" maxFractionDigits="0"
										value="${(weather.low -32) * 5/9}" /> C. 
								</c:when>

								<c:when test="${temperature == 'fahrenheit'}">
									<fmt:formatNumber type="number" maxFractionDigits="0"
										value="${weather.low}" /> F. 
								</c:when>
				<c:otherwise>
				<fmt:formatNumber type="number" maxFractionDigits="0"
								value="${weather.low}" /> F.
							
         </c:otherwise>
							</c:choose>

							<br>

							<c:out value="High temperature " />
							
							<c:choose>
								<c:when test="${temperature == 'celsius'}">
									<fmt:formatNumber type="number" maxFractionDigits="0"
										value="${(weather.high -32) * 5/9}" /> C. 
								</c:when>

								<c:when test="${temperature == 'fahrenheit'}">
									<fmt:formatNumber type="number" maxFractionDigits="0"
										value="${weather.high}" /> F. 
								</c:when>
								
								<c:otherwise>
								<fmt:formatNumber type="number" maxFractionDigits="0"
								value="${weather.high}" /> F.
							</c:otherwise>
							</c:choose>
							<br>

							<c:choose>
								<c:when test="${weather.low < 20}">
									<c:out
										value=" Please take caution as the weather will be frigid today." />
								</c:when>
							</c:choose>

							<c:choose>
								<c:when test="${weather.forecast == 'rain'}">
									<c:out value="You should bring rain gear and waterproof shoes." />
								</c:when>
								<c:when test="${weather.forecast == 'snow'}">
									<c:out value="You should bring snowshoes." />
								</c:when>
								<c:when test="${weather.forecast == 'thunderstorms'}">
									<c:out
										value="Please seek shelter and avoid hiking on exposed ridges." />
								</c:when>

								<c:when test="${weather.forecast == 'sunny'}">
									<c:out value="Please use sunblock." />
								</c:when>

							</c:choose>
							<br>

							<c:choose>
								<c:when test="${weather.high > 75}">
									<c:out
										value="Please bring an extra gallon of water to remain hydrated." />
								</c:when>
							</c:choose>
							<br>
							<c:choose>
								<c:when test="${weather.high - weather.low > 20}">
									<c:out value="Please wear breathable layers." />
									<br>
								</c:when>

							</c:choose>
						</div>
					</div>
					<br>
				</div>
				<br>
			</div>
		</div>


	</c:forEach>
		<form method="POST" action="parkDetail">
		<label for="temp">Display temperature in </label> <input
			type="radio" name="temp" value="celsius"> Celsius <input
			type="radio" name="temp" value="fahrenheit"> Fahrenheit <input
			type="hidden" name="parkcode" value="${park.parkcode}"> <input
			type="submit" />
	</form>
	<br>