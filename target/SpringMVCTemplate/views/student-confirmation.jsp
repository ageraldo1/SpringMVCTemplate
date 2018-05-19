<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirmation Page</title>
</head>
<body>

	<h1>Student Confirmation result</h1>
	<hr>
	 
	<h2> Student First Name : ${student.firstName} </h2>
	<br> 
	
	<h2> Student Last Name : ${student.lastName} </h2>
	<br> 

	<h2> Student Country : ${student.country} </h2>
	<br> 

	<h2> Favorite Language : ${student.favoriteLanguage} </h2>
	<br>
	
	Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.operationSystems}">
			<li> ${temp} </li>
		</c:forEach>
	</ul>
	 
	<hr>
		<a href="/SpringMVCTemplate"> Return to Main Menu</a>  
</body>
</html>