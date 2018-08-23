<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<main class="container" maxwidth = 300px>
	
	<h3>Please enter customer information</h3>
	<button><a href="/">HOME</a></button>
	<button><a href="/AdminUsers">BACK</a></button><br>
		<br>
	<form action="/NewUserSubmit" method="post" class="form">
		<div class="form-group row">
			<label for="firstName" class="col-sm-2 col-form-label">First Name:</label>
    		<div class="col-sm-10">
			<input class="form-control" name="firstName" required minlength="2" maxlength="10"/>
			</div>
		</div>
		<div class="form-group row">
			<label for="lastName" class="col-sm-2 col-form-label">Last Name:</label>
			<div class="col-sm-10">
			<input class="form-control" name="lastName" pattern="[A-Z][a-z]*"/>
			</div>
		</div>
		<div class="form-group row">
			<label for="emailAddress" class="col-sm-2 col-form-label">Email:</label> 
			<div class="col-sm-10">
			<input class="form-control" name="emailAddress" type="email"/>
			</div>
		</div>
		<fieldset class="form-group">
		    <div class="row">
		      <legend class="col-form-label col-sm-2 pt-0">Join Email List</legend>
		      <div class="col-sm-10">
		        <div class="form-check">
		          <input class="form-check-input" type="radio" name="optin" id="gridRadios1" value=true>
		          <label class="form-check-label" for="gridRadios1">
		            Opt-In
		          </label>
		        </div>
		        <div class="form-check">
		          <input class="form-check-input" type="radio" name="optin" id="gridRadios2" value=false checked>
		          <label class="form-check-label" for="gridRadios2">
		            Opt-Out (and probably die alone)
		          </label>
		        </div>
		      </div>
		    </div>
		  </fieldset>
		<div class="form-group row">
			<label for="phoneNumber" class="col-sm-2 col-form-label">Phone Number:</label> 
			<div class="col-sm-10">
			<input class="form-control" placeholder="XXX-XXX-XXXX" name="phoneNumber" pattern="\d\d\d-\d\d\d-\d\d\d\d"/>
			</div>
		</div>
		<button type="submit" class="btn btn-primary">ENTER</button>
		</form>
</body>
</html>