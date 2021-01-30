<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>
</head>
<body>
<h1 align = "center">Menu</h1>
<table border = "1" cellpadding = "40%" bordercolor = "red" align = "center">
	<tr>
	<th>ID</th>
	<th>ITEM</th>
	<th>PRICE</th>
	</tr>
	<c:forEach var = "items" items = "${foodItems}">
	<tr>
	<td>${items.id}</td>
	<td>${items.item}</td>
	<td>${items.price}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>