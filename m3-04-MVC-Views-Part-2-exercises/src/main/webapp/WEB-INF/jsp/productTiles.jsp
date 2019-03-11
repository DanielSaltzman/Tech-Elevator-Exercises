<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="common/header.jsp" %>


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
							<a href="${productDetailURL}"><c:out value="${product.name}"/></a>
						</h4>
					</div>
				<div class="price">
					<c:choose>
						<c:when test="${product.topSeller}">
							BEST SELLER!
						</c:when>
					</c:choose>
				</div>
					by <c:out value="${product.manufacturer}"/>
					
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
				weight <c:out value="${product.weightInLbs}"/> lbs
				</div>
				<fmt:formatNumber type="number" maxFractionDigits="0" value="${product.averageRating}" var="starsImage"/>
					<img class="ratingTiles" src="img/${starsImage}-star.png" alt="stars"/>
				</div>
				
				
			</c:forEach>
					
			
			
			</div>
			
<%@ include file="common/footer.jsp" %>