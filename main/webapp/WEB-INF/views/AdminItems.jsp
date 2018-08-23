<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<div class="container">
		<p>Admin Dashboard - Items 
		<button><a href="/AddItemForm">ADD NEW</a></button>
		<button><a href="/">BACK</a></button>
		</p>
		
		<table class="table" table-responsive-md btn-table>
			<thead class="black white-text">
			
				<tr>
					<th>Edit</th><th>Delete</th><th>Product</th><th>Price</th><th>Quantity<th>Description</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${items}">
				<tr>
					<td><button type="submit" formaction="/EditItem">EDIT</button></td>
					<td><button type="submit" formaction="/ConfirmDeleteItem">DELETE</button></td>
					<td>${item.name}</td>
					<td>${item.price}</td>
					<td>${item.quantity}</td>
					<td>${item.description}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>	
	</div>
	
					
	

</body>
</html>