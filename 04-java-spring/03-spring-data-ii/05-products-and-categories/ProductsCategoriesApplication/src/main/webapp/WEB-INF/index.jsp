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
<title>Products and Categories</title>
</head>
<body>
	<div class="container">
		<h1>Welcome to Products and Categories</h1>
	<a href="<%=request.getContextPath() %>/products">Products</a>
	<a href="<%=request.getContextPath() %>/categories">Categories</a>
	</div>
</body>
</html>