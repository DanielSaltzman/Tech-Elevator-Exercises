<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="common/header.jsp" %>

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
				<p class="names"><c:out value="${product.name}" /></p>
				</a>
					<c:choose>
					<c:when test="${product.topSeller}">
					<div class="red"><c:out value="${product.topSeller? ' Best Seller!':''}"/></div>
					</c:when>
					</c:choose>
					<div class="manufacturer">by <c:out value="${product.manufacturer}"/></div>
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
<%@ include file="common/footer.jsp" %>
    