<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is the complete list</title>

<link rel="stylesheet"href="/style.css" />
</head>
<body>
<H1>Complete List</H1>

<table style="width:55%">
<tr>
    <th>first name</th>
    <th>last name</th>
   <th>innovation</th>
   <th>year</th>
  </tr>
  

<c:forEach var="complete" items="${completelist}">
	<tr>	
	<td>${complete.firstName}</td>
	<td>${complete.lastName}</td>
   <td>${complete.innovation}</td>
   <td>${complete.year}</td>
	</tr>
	</c:forEach>
		
   
</table>



<p><a href = "/"> Back to Index/Tiny List</a> </p>
</body>
</html>