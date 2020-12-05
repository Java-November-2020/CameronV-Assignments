<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lookify app</title>
</head>
<body>
<div class="container">
		<h2>Add a new Song</h2>
		<hr />
		<form:form action="/songs" method="POST" modelAttribute="song">
			<div class="form-group">
		        <form:label path="name">Song Title</form:label>
		        <form:errors path="name"/>
		        <form:input class="form-control" path="name"/>
		    </div>
		    <div class="form-group">
		        <form:label path="artist">Artist</form:label>
		        <form:errors path="artist"/>
		        <form:input class="form-control" path="artist"/>
		    </div>
		    <div class="form-group">
		        <form:label path="rating">Rating</form:label>
		        <form:errors path="rating"/>
		        <form:input type="number" class="form-control" path="rating"/>
		    </div>
		    <button>Add Song</button>
		</form:form>
	</div>
</body>
</html>