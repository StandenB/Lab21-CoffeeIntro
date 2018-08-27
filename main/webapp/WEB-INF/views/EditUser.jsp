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
		<p>Edit User 
		<button><a href="/">HOME</a></button>
		<button><a href="/AdminUsers">BACK</a></button>
		</p>
		<form action="/SubmitUserChanges" method="post" class="form">
			<div class="form-group row">
				<label for="firstName" class="col-sm-2 col-form-label">First Name:</label>
	    		<div class="col-sm-10">
				<input class="form-control" value = ${user.firstName} name="firstName" required minlength="2" maxlength="10"/>
				</div>
			</div>
			<div class="form-group row">
				<label for="lastName" class="col-sm-2 col-form-label">Last Name:</label>
				<div class="col-sm-10">
				<input class="form-control" value = {user.lastName} name="lastName" pattern="[A-Z][a-z]*"/>
				</div>
			</div>
			<div class="form-group row">
				<label for="emailAddress" class="col-sm-2 col-form-label">Email:</label> 
				<div class="col-sm-10">
				<input class="form-control" value = ${user.emailAddress} name="emailAddress" type="email"/>
				</div>
			</div>
			<div class="form-group row">
				<label for="phoneNumber" class="col-sm-2 col-form-label">Phone Number:</label> 
				<div class="col-sm-10">
				<input class="form-control" value = ${ user.phoneNumber } name="phoneNumber" pattern="\d\d\d-\d\d\d-\d\d\d\d"/>
				</div>
			</div>
		<button type="submit">UPDATE</button>
		</form>
	</div>
</body>
</html>