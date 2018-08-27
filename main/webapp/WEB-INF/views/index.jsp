<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/style.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="navbar.jsp" %>
<div class="container">
<h1>COFFEE <img src="/images/Coffee_cup.png"/>COFFEE <img src="/images/Coffee_cup.png"/>COFFEE!</h1>
	<p>
		Welcome to GC COFFEE 
		<button><a href="/Register">Register!</a></button>
	</p>
	<p><b>Today's Menu</b></p>
		<table class="table">
			<thead>
				<tr>
					<th>Product</th><th>Price</th><th>Description</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${items}">
				<tr>
					<td>${item.name}</td>
					<td>${item.price}</td>
					<td>${item.description}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<button><a href=AdminItems>Edit Items</button>
		<button><a href=AdminUsers>Edit Users</button>
	</div>
</body>
</html>