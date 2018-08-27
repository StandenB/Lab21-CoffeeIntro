<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
		<p>Admin Dashboard - Users 
		<button><a href="/AddUserForm">ADD NEW</a></button>
		<button><a href="/">BACK</a></button>
		</p>
		<form action="/EditUser" method="post" class="form">
		<table class="table" table-responsive-md btn-table>
			<thead class="black white-text">
			
				<tr>
					<th>Edit</th><th>Delete</th><th>First</th><th>Last</th><th>Email<th>Phone</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${users}">
				<tr>
					<td><button type="submit" action="/EditUser/?id=${user.idusers}">EDIT</button></td>
					<td><a type=button onclick="return confirm('Are you sure you want to delete?')" href="/DeleteUser/?id=${ user.idusers }">DELETE</a></td>
					<td>${user.firstName}</td>
					<td>${user.lastName}</td>
					<td>${user.emailAddress}</td>
					<td>${user.phoneNumber}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</form>	
	</div>
	
</body>
</html>