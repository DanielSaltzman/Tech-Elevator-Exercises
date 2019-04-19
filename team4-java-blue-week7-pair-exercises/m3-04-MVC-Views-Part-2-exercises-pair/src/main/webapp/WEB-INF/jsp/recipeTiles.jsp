<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width" />
<title>Recipe List View</title>
<link rel="stylesheet" href="css/site.css" />
</head>
<body>
	<header>
		<h1>MVC Exercises - Views Part 2: Models</h1>
	</header>
	
	<nav>
		<ul>
			<li><a href="recipeTiles">Board Layout</a></li>
			<li><a href="recipeTiles">Tile Layout</a></li>
			<li><a href="recipeTable">Table Layout</a></li>
		</ul>
		

	</nav>
	<section id="main-content">
	
		<h1>Recipes</h1>
		

		<!-- Use the request attribute "recipes" (List<Recipe>) -->
		<c:forEach var="recipes" items="${recipes}">
		${recipes.name}
	
           </c:forEach>                                          		
	
		<c:forEach begin="0" end="2" var="num">
		<img id="${image}" class="imageStyle" src="img/recipe${num}.jpg" />
		<c:set var="counter" value="${counter+1}" />
		
			</c:forEach>



		
	</section>
</body>
</html>