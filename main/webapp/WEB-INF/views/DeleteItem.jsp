<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<form action="delete-item" method="post">
		<table class="table">
			<thead>
				<tr>
					Warning: Are you sure you want to delete?
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><button type="submit">CONFIRM</button>
					<td><button><a href="/AdminItems">CANCEL</a></button>
					<td>${item.id}</td>
					<td>${item.name}</td>
					<td>${item.price}</td>
					<td>${item.quantity}</td>
				</tr>
			</tbody>
		</table>
	</form>
</div>
</body>
</html>
