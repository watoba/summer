<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>結果</title>
</head>
<body>
	<h1>Customers</h1>
	<table border="1">
		<tr><th>name</th><th>pass</th></tr>
		<c:forEach var="customer" items="${customers}">
			<c:forEach var="hobbys" items="${hobby}">
				<tr><td>${customer.name}</td><td>${hobbys}</td></tr>
			</c:forEach>
		</c:forEach>
	</table>
	<a href="nakai_index.jsp">Back Nakai page</a><br>
	<a href="index.html">Back Home Page</a><br>
</body>
</html>