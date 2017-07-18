<%@ page pageEncoding="Windows-31J"
	contentType="text/html; charset=Windows-31J" %>

<html>
<head><title>ŒvZ</title></head>
<body>
	<h1>ŒvZ</h1>
	<form method='get' action='InfoTest'>
	<input type='text' name='fir'>
	{<input type='radio' name='radio' value='+'>
	|<input type='radio' name='radio' value='-'>
	~<input type='radio' name='radio' value='*'>
	€<input type='radio' name='radio' value='/'>
	<input type='text' name='sec'><br>

	<input type='submit' value='‘—M'>
	</form>

	<h1>‰ğ“š</h1>
	<table border="1">
		<tr><td>${fir}</td><td>${radio}</td><td>${sec}</td><td>= ${result}</td>
	</table>
</body>
</html>