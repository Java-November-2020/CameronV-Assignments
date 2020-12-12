<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>categories</title>
</head>
<body>
	<div class="container">
		<h1>Categories</h1>
		<form action="post">
		<p>create a category</p>
		name:<input type="text" name="name" "/>
		<button>create</button>
		<p>all categories</p>
		<p>add products to category</p>
		category<select name="category" id="category">
		<select id="selectedRecord" name="selectedRecord">

            <c:forEach var="categories" items="${categories}">

                <option value="${categories}">${categories.name}</option>

            </c:forEach>

        </select>
		</select>
		products<select name="products" id="products">
		<select id="selectedRecord" name="selectedRecord">

            <c:forEach var="products" items="${products}">

                <option value="${products}">${products.name}</option>

            </c:forEach>

        </select>
		</select>
		<button>Submit</button>
		</form>
	</div>
</body>
</html>