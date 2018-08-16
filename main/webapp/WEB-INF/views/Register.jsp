<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/AddUser">
	<p>
		First Name: <input name="firstName"/>
	</p>
	<p>
		Last Name: <input name="lastName"/>
	</p>
	<p>
		Email: <input name="emailAddress"/>
	</p>
	<p>
		Phone Number: <input name="phoneNumber"/>
	</p>
	<p>
		Password: <input name="password"/><br>
	</p>
	<p>
	<button>Register</button>
	</form>

</body>
</html>