<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Tiles View</title>
    <link rel="stylesheet" href="css/site.css" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul>
            <li><a href="#">Link 1</a></li>
            <li><a href="#">Link 2</a></li>
        </ul>
        
    </nav>
    <section id="main-content">
    <h1>Toy Department</h1>
		<div class="flexContainer">
				
			<c:forEach var="product" items="${productList}">
				<div class="flexContainerTile">
					<c:url var="productDetailURL" value= "/productDetail">
						<c:param name="productId" value="${product.productId}"/>
					</c:url>
						<a href="${productDetailURL}">
							<img src="img/${product.imageName}" class="productImage"/>
						</a>
					<div class="flexContainerTextTiles">
						<h4 class="link">
							<a href="${productDetailURL}">${product.name}</a>
						</h4>
					</div>
				<div class="price">
					<c:choose>
						<c:when test="${product.topSeller}">
							BEST SELLER!
						</c:when>
					</c:choose>
				</div>
					by ${product.manufacturer}
					
				<div class="blue">
					<c:choose>
						<c:when test="${product.remainingStock < 5}">
							Only <c:out value="${product.remainingStock}" /> left!
						</c:when>
					</c:choose>
				</div>
				
				<div class="price">
					<fmt:formatNumber value="${product.price}" type="currency"/>
				</div>
				<div>
				weight ${product.weightInLbs} lbs
				</div>
				<fmt:formatNumber type="number" maxFractionDigits="0" value="${product.averageRating}" var="starsImage"/>
					<img class="ratingTiles" src="img/${starsImage}-star.png" alt="stars"/>
				</div>
				
				
			</c:forEach>
					
			
			
			</div>
       

    </section>
</body>
</html>