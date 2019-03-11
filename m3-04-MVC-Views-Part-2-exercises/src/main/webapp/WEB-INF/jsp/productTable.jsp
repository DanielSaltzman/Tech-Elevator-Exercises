<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="common/header.jsp" %>
     	

       	<table id="productTable">
       		<tr class="tablePics">
       		<td></td>
       			<td><img id="tablePicture1" src="img/toy-balls.jpg" alt="Stackable Balls"/></td>
       			<td><img id="tablePicture2" src="img/toy-car.jpg" alt="Car"/></td>
       			<td><img id="tablePicture3" src="img/toy-gym.jpg" alt="Fitness Gym"/></td>
       			<td><img id="tablePicture4" src="img/toy-horse.jpg" alt="Toy Horse"/></td>
       			<td><img id="tablePicture5" src="img/toy-snail.jpg" alt="Toy Snail"/></td>
       			<td><img id="tablePicture6" src="img/toy-tricycle.jpg" alt="Tricycle"/></td>
       		</tr>
       		<tr>
       			<td></td>
       			<c:forEach var="product" items= "${productList}">
       				<c:choose>
       					<c:when test="${product.topSeller}">
       						<td id="bestSeller">BEST SELLER!</td>
       				</c:when>
       					<c:otherwise>
       					<td></td>
       					</c:otherwise>
       				</c:choose>
       			</c:forEach>
       			</tr>
       			
       			<tr class="gray">
       				<th>Name</th>
       					<c:forEach var="product" items="${productList}">
       						<c:url var="productDetailUrl" value="/productDetail">
       							<c:param name="productId" value="${product.productId}"/>
       						</c:url>
       						<td ><a href="${productDetailURL}"><c:out value="${product.name}"/></a></td>
       					</c:forEach>
       			</tr>
       			
       			<tr> 
       				<th>Rating</th>
       				<c:forEach var="product" items="${productList}">
       					<fmt:formatNumber type="number" maxFractionDigits="0" value="${product.averageRating}" var="starsImage" />
       					<td><img id="starRate" src="img/${starsImage}-star.png" /></td> 
       				</c:forEach>
       			</tr>
       			
       			<tr class="gray"> <th>Mfr</th>
       			<c:forEach var="product" items="${productList}">
       				<td class="gray"><c:out value="${product.manufacturer}"/></td>
       			</c:forEach>
       			</tr>
       			
       			<tr>
       				<th>Price</th>
       				<c:forEach var="product" items="${productList}">
       					<td><c:out value="${product.price}"/></td>
       				</c:forEach>
       			</tr>
       			
       			<tr class="gray"> <th>wt. (in lbs.)</th>
       				<c:forEach var="product" items="${productList}">
       					<td><c:out value="${product.weightInLbs}"/></td>
       				</c:forEach>
       			</tr>
       		</table>
<%@ include file="common/footer.jsp" %>