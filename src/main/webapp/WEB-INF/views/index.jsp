<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"href="/style.css" />
</head>
<body>
<h1>This is the tiny list</h1>


<table style="width:15%">
<tr>
    <th>name</th>
   <th>innovation</th>
   <th>year</th>
  </tr>
  
  

<c:forEach var="tiny" items="${tinylist}">
	<tr>	
	<td>${tiny.name}</td>
   <td>${tiny.innovation}</td>
   <td>${tiny.year}</td>
	</tr>
	</c:forEach>
		
   
</table>


<p><a href = "/complete"> Complete List</a> </p>
</body>
</html>