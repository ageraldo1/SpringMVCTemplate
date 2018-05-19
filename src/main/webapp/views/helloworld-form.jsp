<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World - Input Form</title>
</head>
<body>

<h2> ProcessForm example </h2>
<hr>
<form action="processForm" method="POST">
	<input type="text" name="studentName" placeholder="What is your name?" />
	<input type="submit" />

</form>
<br>


<h2> processFormToUpperCase example </h2>
<hr>
<form action="processFormToUpperCase" method="POST">
	<input type="text" name="studentName" placeholder="What is your name?" />
	<input type="submit" />

</form>
<br>


<h2> processFormUsingRequestParam example </h2>
<hr>
<form action="processFormUsingRequestParam" method="POST">
	<input type="text" name="studentName" placeholder="What is your name?" />
	<input type="submit" />

</form>
<br>


</body>
</html>