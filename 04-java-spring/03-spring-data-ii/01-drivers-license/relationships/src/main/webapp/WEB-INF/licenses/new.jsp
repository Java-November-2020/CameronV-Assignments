<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DMV app</title>
</head>
<body>
<div class="container">
		<h2>New License</h2>
		<form:form action="/licenses" method="POST" modelAttribute="license">
			<div class="form-group">
		        <form:label path="person">Person</form:label>
		        <form:errors path="person"/>
		        <form:select class="form-control" path="person">
		        <c:forEach items="${ persons }" var="p">
		        	<form:option value="${ p.id }">${ p.firstName } ${ p.lastName }</form:option>
		        </c:forEach>
		        </form:select>
		    </div>
			<div class="form-group">
		        <form:label path="state">State</form:label>
		        <form:errors path="state"/>
		        <form:input class="form-control" path="state"/>
		    </div>
		    <div class="form-group">
		        <form:label path="exirationDate">Expiration Date</form:label>
		        <form:errors path="exirationDate"/>
		        <form:input type="date" class="form-control" path="exirationDate"/>
		    </div>
		    <button>Add License</button>
		</form:form>
	</div>
</body>
</html>