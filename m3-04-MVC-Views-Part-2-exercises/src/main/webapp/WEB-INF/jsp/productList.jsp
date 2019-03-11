<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product List View</title>
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
    
    	<h2>Toy Department</h2>
		
		<c:forEach var="product" items="${productList}">
		
			<div class = "single">
				
				<c:url var="productDetailURL" value= "/productDetail">
				<c:param name="productId" value="${product.productId}"/>
				</c:url>
				<a href="${productDetailURL}">
				<img  src="img/${product.imageName}" class="imageList">
				</a>
				
			<div class="content">
				
				<c:url var="productDetailURL" value="/productDetail">
				<c:param name="productId" value="${product.productId}"/>
				</c:url>
				<a href="${productDetailURL}">
				<p class="names">${product.name}</p>
				</a>
					<c:choose>
					<c:when test="${product.topSeller}">
					<div id="bestSeller">BEST SELLER!</div>
					</c:when>
					</c:choose>
					<div class="manufacturer">by ${product.manufacturer}</div>
					<div class="price"><fmt:formatNumber value="${product.price}" type="currency"/>
					</div>
					<div class=weight><p class="wordWeight">Weight</p>
					<fmt:formatNumber type="number" maxFractionDigits="0" value="${product.weightInLbs}"/> lbs
					</div>
					<fmt:formatNumber type="number" maxFractionDigits="0" value="${product.averageRating}" var="starsImage"/>
					<img id="starRate" src="img/${starsImage}-star.png" alt="stars"/>
			</div>
			</div>
			<hr>
		</c:forEach>
    </section>
</body>
</html>