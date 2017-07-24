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
	<h1>Hobbies</h1>
	${username}は以下のものに興味を持っている<br>
	<c:forEach var="hobby" items="${hobbies}">
		${hobby},
	</c:forEach><br>
	<a href="nakai_index.jsp">Back Nakai page</a><br>
	<a href="index.html">Back Home Page</a><br>
</body>
</html>