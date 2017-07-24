<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>結果</title>
</head>
<body>
	<h1>Customers</h1>
	<table border="1">
		<tr><th>name</th><th>pass</th></tr>
		<c:forEach var="customer" items="${customers}">
			<tr><td>${customer.name}</td><td>${customer.pass}</td></tr>
		</c:forEach>
	</table>
	<a href="alex_index.jsp">Back Alex page</a><br>
	<a href="index.html">Back Home Page</a><br>
</body>
</html>