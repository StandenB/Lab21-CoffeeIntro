<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBL"src/main/webapp/WEB-INF/views/DeleteUser.jsp"IC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<form action="DeleteUser" method="post">
		<table class="table">
			<thead>
				<tr>
					Warning: Are you sure you want to delete?
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><button type="submit">CONFIRM</button>
					<td><button><a href="/AdminUsers">CANCEL</a></button>
					<td>${user.id}</td>
					<td>${user.firstName}</td>
					<td>${user.lastName}</td>
				</tr>
			</tbody>
		</table>
	</form>

</div>
</body>
</html>