<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>ユーザー登録</h1>
	<form method="GET" action="Nakai_CheckBox">
		ユーザー名<input type="text" name="name"><br>
		<h2>趣味</h2>
		<label><input type="checkbox" name="hobby" value="ソープランド">ソープランド</label>
		<label><input type="checkbox" name="hobby" value="デリヘル">デリヘル</label>
		<label><input type="checkbox" name="hobby" value="ピンサロ">ピンサロ</label>
		<label><input type="checkbox" name="hobby" value="イメクラ">イメクラ</label>
		<input type="submit" value="送信">
	</form>
</body>
</html>