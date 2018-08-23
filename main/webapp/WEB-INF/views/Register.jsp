<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/style.css"/>
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<main class="container" maxwidth = 300px>
	
	<h3>Please enter your information to register</h3><button><a href="/">BACK</a></button><br>
		<br>
	<form action="/AddUser" method="post" class="form">
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
		<div class="form-group row">
		    <div class="col-sm-2">Decaffeinated?</div>
		    <div class="col-sm-10">
		      <div class="form-check">
		        <input class="form-check-input" value="true" type="checkbox" name="decaf">
		        <label class="form-check-label" for="gridCheck1">
		          Yes
		        </label>
		      </div>
		     </div>
		</div>
		
		<div class="form-group row">
			<label for="race" class="col-sm-2 col-form-label">Ethnicity:</label>
			<div class="col-sm-10">
				<select class="race">
					<option value="" selected disabled hidden>Please select</option>
				    <option value="native">American Indian/Alaska Native</option>
				    <option value="asian">Asian</option>
				    <option value="black">Black/African American</option>
				    <option value="islander">Hawaiian/Pacific Islander</option>
				    <option value="hispanic">Hispanic/Latino</option>
				    <option value="multiracial">Multiracial</option>
				    <option value="white">White</option>
				</select>
			</div>
		</div>
		<div class="form-group row">
			<label for="password" class="col-sm-2 col-form-label">Password:</label> 
			<div class="col-sm-10">
			<input class="form-control" type="password" name="password" 
					required minlength="8" maxlength="20"/>
			<small id="passwordHelpInline" class="text-muted">
      		Must be 8-20 characters long.</small>
			</div>
			<label for="passwordMatch" class="col-sm-2 col-form-label">Retype Password:</label> 
			<div class="col-sm-10">
			<input class="form-control" type="password" name="passwordMatch"/><br>
			</div>
		</div>
		<spring:hasBindErrors name="password">
    		<c:if test="${errors.globalErrorCount > 0}">
        		<div class="alert alert-danger"><form:errors/>
        		</div>
    		</c:if>
		</spring:hasBindErrors>
		<button type="submit" class="btn btn-primary">Register</button>
		
		</form>
	</main>
</body>
</html>