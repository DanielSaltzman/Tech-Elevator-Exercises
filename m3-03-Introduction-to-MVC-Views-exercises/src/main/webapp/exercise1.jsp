<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 1 - FizzBuzz</title>
		<style>
			li {
				list-style-type: none;
			}
			
			.fizz {
				color: blue;
			}
			
			.buzz {
				color: red;
			}
			
			.fizzbuzz {
				color: purple;
				font-size: 150%;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 1 - FizzBuzz</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) containing each of the numbers from 1 to 100.
				
				if the number is divisible by 3, show "Fizz!" instead and style the item using the "fizz" class
				
				if the number is divisible by 5, show "Buzz!" instead and style the item using the "buzz" class
				
				if the number is divisible by both 3 and 5, show "FizzBuzz!" instead  and style the item using the "fizzbuzz" class
				
				see exercise1-fizzbuzz.png for example output
			 --%>
			 <c:forEach begin= "1" end= "100" var= "nums">
			 	<c:choose>
			 		<c:when test="${ nums %15 == 0 }">
			 			<c:set var="rowClassAttribute" value="fizzbuzz"/>
			 		</c:when>
			 		<c:when test="${ nums % 3 == 0 || nums / 3 == 1 }">
			 			<c:set var="rowClassAttribute" value="fizz" />
			 		</c:when>
			 		<c:when test="${ nums % 5 == 0 || nums / 5 == 1}">
			 			<c:set var="rowClassAttribute" value="buzz"/>
			 		</c:when>
			 		<c:otherwise>
			 			<c:set var="rowClassAttribute" />
			 		</c:otherwise>
			 	</c:choose>
			 		<ul class="${rowClassAttribute}">
			 	<c:choose>
			 		<c:when test="${ nums % 15 == 0 }">
			 			<c:out value ="FizzBuzz!"/>
			 		</c:when>
			 		<c:when test="${ nums % 3 == 0 || nums / 3 == 1 }">
			 			<c:out value = "Fizz!"/>
			 		</c:when>
			 		<c:when test="${nums % 5 == 0 || nums / 5 == 1 }">
			 			<c:out value="Buzz!"/>
			 		</c:when>
			 		<c:otherwise>
			 			<li><c:out value="${nums}"/></li>
			 		</c:otherwise>
			 	</c:choose>
			 </ul>
		</c:forEach>
	</ul>
	</body>
</html>