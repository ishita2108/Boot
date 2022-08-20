<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>product id</th>
				<th>product name</th>
				<th>product price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allproducts}" var="product">
				<tr>
					<td>${product.id }</td>
					<td>${product.name }</td>
					<td>${product.price }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>