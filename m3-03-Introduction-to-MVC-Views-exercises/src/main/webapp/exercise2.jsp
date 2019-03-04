<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>
			 	
			 	<c:set var= "fibo" value= "0"/>
			 	<c:set var= "fibo2" value= "1"/>
			 	<c:set var ="fibo3" value= "${fibo + fibo1}"/>
			 	<li>${fibo3}</li>
			 	<c:forEach begin= "1" end= "25" var="nums">
			 		<c:set var="fibo3" value="${fibo + fibo2}"/>
			 		<c:set var="fibo" value= "fibo2"/>
			 		<c:set var= "fibo2" value= "fibo3"/>
			 			<li> ${fibo3}</li>
			 	</c:forEach>	
			 		
		</ul>
	</body>
</html>